class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 0;
        int currMax;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            currMax = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    currMax = Math.max(currMax, dp[j]);
                }
            }
            currMax++;
            result = Math.max(result, currMax);
            dp[i] = currMax;
        }
        
        return result;
    }
}

/**
NOTES:
- unsorted
- subsequence (values are not necessarily consecutive)
- find the length (int)

      4,3,3,2, 1 , 1   
[10,9,2,5,3,7,101,18]
      j


**/
