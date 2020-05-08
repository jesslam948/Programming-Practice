class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        
        int majority = 0;
        
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            
            if (counts.get(nums[i]) > nums.length / 2) {
                majority = nums[i];
            }
        }
        
        return majority;
    }
}
