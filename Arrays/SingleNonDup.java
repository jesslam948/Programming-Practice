class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                return nums[i];
            } else {
                i += 2;
                j += 2;
            }
        }
        
        return nums[i];
    }
}
