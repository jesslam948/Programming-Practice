class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }
        
        //going forward
        int product = 1;
        for (int j = 0; j < nums.length; j++) {
            result[j] *= product;
            product *= nums[j];
        }
        
        //going backward
        product = 1;
        for (int k = nums.length - 1; k >= 0; k--) {
            result[k] *= product;
            product *= nums[k];
        }
        
        return result;
        
        /**
        nums:   1, 2, 3, 4
                j
        result: 1, 1, 1, 1
        **/
    }
}
