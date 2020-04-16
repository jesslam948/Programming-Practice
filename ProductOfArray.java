class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        
        // initialize all elems in prod to 1
        for (int i = 0; i < nums.length; i++) {
            products[i] = 1;
        }
        
        int multiplier = 1; // keeps track of the product of the previouisly visited elems
        
        // going right
        for (int i = 0; i < nums.length; i++) {
            products[i] *= multiplier;
            multiplier *= nums[i];
        }
        
        multiplier = 1;
        
        // going left
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= multiplier;
            multiplier *= nums[i];
        }
        
        return products;
    }
}
