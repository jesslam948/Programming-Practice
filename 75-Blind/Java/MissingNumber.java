class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i]; // since a ^ b ^ b = a
        }
        
        return result ^ nums.length; // to account for the missing number
    }
}
