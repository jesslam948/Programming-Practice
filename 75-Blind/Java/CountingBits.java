class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        
        for (int i = 1; i < result.length; i++) {
            if (i % 2 == 1) {
                result[i] = result[i >> 1] + 1;
            } else {
                result[i] = result[i >> 1];
            }
        }
        
        return result;
    }
}
