class Solution {
    public int firstUniqChar(String s) {
        boolean isFirst = false;
        int i = 0;
        
        while (!isFirst && i < s.length()) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                isFirst = true;
            } else {
                i++;
            }
        }
        
        if (!isFirst) {
            return -1;
        } else {
            return i;
        }
    }
}
