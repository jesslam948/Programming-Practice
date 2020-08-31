class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // set the top row to 1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        
        // set the left col to 1
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // now calculate unique paths
        for (int c = 1; c < m; c++) {
            for (int r = 1; r < n; r++) {
                dp[c][r] = dp[c - 1][r] + dp[c][r - 1];
            }
        }
        
        return dp[m - 1][n - 1];
    }
}
