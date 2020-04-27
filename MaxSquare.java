class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int[][] maxSq = new int[matrix.length][matrix[0].length];
        
        int globalMax = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int max = 0;
                if (matrix[i][j] == '1') {
                    if (j == 0 || i == 0) {
                        max = 1;
                    } else {
                        int temp = Math.min(maxSq[i - 1][j - 1],
                                            Math.min(maxSq[i - 1][j], maxSq[i][j - 1]));
                        max = (int)Math.pow((int)Math.sqrt(temp) + 1, 2);
                    }
                } else {
                    max = 0;
                }
                maxSq[i][j] = max;
                globalMax = Math.max(globalMax, max);
            }
        }
        
        return globalMax;
    }
}
