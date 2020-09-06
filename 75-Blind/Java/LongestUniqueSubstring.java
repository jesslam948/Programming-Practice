class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> letters = new HashSet<>();
        
        int i = 0;  // start ptr
        int j = 0;    // end ptr
        int maxLen = 0; // overall max length
        
        while (j < s.length()) {
            if (!letters.contains(s.charAt(j))) {
                letters.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, letters.size());
            } else {
                letters.remove(s.charAt(i));
                i++;
            }
        }
        
        return maxLen;
    }
}

/**
   i
pwwkew
     j

len=3
maxLen=3
**/
