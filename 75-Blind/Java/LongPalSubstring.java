class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        
        String currMax;
        String totalMax = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            String odd = getPal(i - 1, i + 1, s);
            String even = getPal(i - 1, i, s);
            if (odd.length() > even.length()) {
                currMax = odd;
            } else {
                currMax = even;
            }
            
            if (currMax.length() > totalMax.length()) {
                totalMax = currMax;
            }
        }
        
        return totalMax;
    }
    
    String getPal(int left, int right, String s) {
        
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return s.substring(left + 1, right);
    }
}
