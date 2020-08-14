class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) { return -1; }
        
        int result = nums[0];
        int currSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            result = Math.max(currSum, result);
        }
        
        return result;
    }
}
