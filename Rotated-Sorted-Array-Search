class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        int mid;
        
        //find start of the sorted list (the min)
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        //find where to start searching
        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        }
        else {
            right = start;
        }
        
        //search
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
