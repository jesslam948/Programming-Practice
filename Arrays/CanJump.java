class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        
        int lastInd = nums.length - 1;
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= lastInd) {
                lastInd = i;
            }
        }
        
        return lastInd == 0;
    }
}
