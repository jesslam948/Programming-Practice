class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1' && !visited[r][c]) {
                    visitNeighbors(grid, visited, r, c);
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void visitNeighbors(char[][] grid, boolean[][] visited, int r, int c) {
        if (grid[r][c] != '0' && !visited[r][c]) {
            visited[r][c] = true;
        } else {
            return;
        }
        
        if (r - 1 >= 0) {
            visitNeighbors(grid, visited, r - 1, c);
        }
        if (r + 1 < grid.length) {
            visitNeighbors(grid, visited, r + 1, c);
        }
        if (c - 1 >= 0) {
            visitNeighbors(grid, visited, r, c - 1);
        }
        if (c + 1 < grid[r].length) {
            visitNeighbors(grid, visited, r, c + 1);
        }
    }
}
