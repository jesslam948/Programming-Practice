class Solution {
    public int maxArea(int[] height) {
        int max = Math.min(height[0], height[1]);
        
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            // area using min bc limited by the shorter line
            int temp = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, temp);
            // move the pointer to the shorter line closer to hopefully find a taller line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}
