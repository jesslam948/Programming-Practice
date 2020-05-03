class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        
        for (int j = 0; j < S.length(); j++) {
            String s = S.substring(j, j + 1);
            if (J.indexOf(s) != -1) {
                count++;
            }
        }
        
        return count;
    }
}
