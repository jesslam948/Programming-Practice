class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<Integer>();
        
        for (int i : nums) {
            if (uniq.contains(i)) { return true; }
            uniq.add(i);
        }
        
        return false;
    }
}
