class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        int s = S.length() - 1;
        int t = T.length() - 1;
        int sCount = 0;
        int tCount = 0;
        
        while (s >= 0 || t >= 0) {
            while (s >= 0 && (S.charAt(s) == '#' || sCount > 0)) {
                if (S.charAt(s) == '#') {
                    sCount++;
                }
                else {
                    sCount--;
                }
                s--;
            }
            while (t >= 0 && (T.charAt(t) == '#' || tCount > 0)) {
                if (T.charAt(t) == '#') {
                    tCount++;
                }
                else {
                    tCount--;
                }
                t--;
            }
            if (s >= 0 && t >=0 && (S.charAt(s) != T.charAt(t))) {
                return false;
            }
            else if ((s < 0 || t < 0) && s != t) {
                return false;
            }
            s--;
            t--;
        }
        return true;
    }
}
