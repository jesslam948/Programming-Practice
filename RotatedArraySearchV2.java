class Solution {
    public int search(int[] nums, int target) {
        
        if (nums.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int mid;
        
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;  
            } else {
                end = mid;
            }
        }
        
        int beg = start;
        start = 0;
        end = nums.length - 1;

        if (target < nums[beg]) {
            return -1;
        } else if (target <= nums[end]) {
            start = beg;
        } else if (target >= nums[start]) {
            end = beg - 1;
        } else {
            return -1;
        }
        
        while (start < end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        if (target == nums[start]) {
            return start;
        } else {
            return -1;
        }
    }
}
