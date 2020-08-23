class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // only proceed if nums[i] is not a duplicate
            if (i == 0 || nums[i] != nums[i - 1]) {
                // now implement 2-sum where sum == -1 * nums[i]
                int sum = 0 - nums[i];
                int low = i + 1;
                int high = nums.length - 1;
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // skip over duplicates
                        while (low < high && nums[low] == nums[low + 1]) { low++; }
                        while (low < high && nums[high] == nums[high - 1]) { high--; }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        
        return result;
    }
}
