class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        
        // find min
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        int start = right;
        
        // set bounds
        if (target > nums[nums.length - 1]) {
            left = 0;
            right = start - 1;
        } else {
            left = start;
            right = nums.length - 1;
        }
        
        // binary search
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}

/**
1. find min
 0 1 2 3 4 5 6
[4,5,6,7,0,1,2]
         lmr
         
[2,3,4,5,6,0,1]
         lr
2. set bounds

3. binary search

**/
