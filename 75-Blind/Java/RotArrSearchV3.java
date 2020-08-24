class Solution {
    public int search(int[] nums, int target) {
        
        // first find min elem
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        int start = left;
        
        // now find the target
        left = 0;
        right = nums.length - 1;
        
        if (target < nums[start]) {
            return -1;
        } else if (target <= nums[right]) {
            left = start;
        } else if (target >= nums[left]) {
            right = start - 1;
        } else {
            return -1;
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}
