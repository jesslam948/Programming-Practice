class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> letters = new HashMap<>();
        
        for (int i = 0; i < magazine.length(); i++) {
            String m = magazine.substring(i, i + 1);
            letters.put(m, letters.getOrDefault(m, 0) + 1);
        }
        
        for (int j = 0; j < ransomNote.length(); j++) {
            String r = ransomNote.substring(j, j + 1);
            if (letters.getOrDefault(r, 0) <= 0) {
                return false;
            } else {
                letters.put(r, letters.getOrDefault(r, 0) - 1);
            }
        }
        
        return true;
    }
}
