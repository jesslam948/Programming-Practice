class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 1) {
                    count++;
                    int addLen = 1; // the length to add for the next sized square
                    boolean isSq = true;
                    while (addLen + r < matrix.length && addLen + c < matrix[r].length) { // bounds checking
                        for (int i = 0; i < addLen; i++) {
                            // check the bottom row added to our square
                            if (matrix[r + addLen][c + i] == 0)
                                isSq = false;
                            // check the right column added to our square
                            if (matrix[r + i][c + addLen] == 0)
                                isSq = false;
                        }
                        // check the corner piece
                        if (matrix[r + addLen][c + addLen] == 0) 
                            isSq = false;
                        // if all added elements are 1, add to count
                        if (isSq) {
                            count++;
                        } else {
                            break;
                        }
                        addLen++;
                    }
                }
            }
        }
        
        return count;
    }
}
