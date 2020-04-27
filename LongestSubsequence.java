class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] maxSeq = new int[text1.length()][text2.length()];
        
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                int max = 0;
                if (text1.charAt(i) == text2.charAt(j)) {
                    if (j > 0 && i > 0) {
                        max = maxSeq[i - 1][j - 1];
                    }
                    max++;
                } else {
                    if (j > 0 && i > 0) {
                        max = Math.max(maxSeq[i - 1][j], maxSeq[i][j - 1]);
                    } else if (j > 0) {
                        max = maxSeq[i][j - 1];
                    } else if (i > 0) {
                        max = maxSeq[i - 1][j];
                    }
                }
                maxSeq[i][j] = max;
            }
        }
        return maxSeq[text1.length() - 1][text2.length() - 1];
    }
}
