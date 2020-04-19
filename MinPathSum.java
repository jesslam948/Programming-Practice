class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        } else if (grid[0].length == 0) {
            return 0;
        }
        
        int[][] auxArr = new int[grid.length][grid[0].length];
        int tSum;
        int lSum;
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (r - 1 >= 0) {
                    tSum = auxArr[r - 1][c];
                } else {
                    tSum = -1;
                }
                if (c - 1 >= 0) {
                    lSum = auxArr[r][c - 1];
                } else {
                    lSum = -1;
                }
                
                int path;
                if (tSum == -1 && lSum == -1) {
                    path = 0;
                } else if (tSum == -1) {
                    path = lSum;
                } else if (lSum == -1) {
                    path = tSum;
                } else {
                    path = Math.min(tSum, lSum);
                }
                auxArr[r][c] = path + grid[r][c];
            }
        }
        
        return auxArr[grid.length - 1][grid[0].length - 1];
    }
}
