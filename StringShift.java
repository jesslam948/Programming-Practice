class Solution {
    public String stringShift(String s, int[][] shift) {
        int amt = 0;
        
        for (int r = 0; r < shift.length; r++) {
            if (shift[r][0] == 0) {
                amt -= shift[r][1];
            }
            else {
                amt += shift[r][1];
            }
        }
        
        if (Math.abs(amt) > s.length()) {
            amt = amt % s.length();
        }
        
        if (amt < 0) {
            amt = s.length() + amt;
        }
        
        char[] sArr = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            if (i + amt < s.length()) {
                sArr[i + amt] = s.charAt(i);
            }
            else {
                sArr[i + amt - s.length()] = s.charAt(i);
            }
        }
        return new String(sArr);
    }
}
