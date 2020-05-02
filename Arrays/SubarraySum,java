class Solution {
    public int subarraySum(int[] nums, int k) {        
        int count = 0;
        int runSum = 0;
        Map<Integer, Integer> sums = new HashMap<>();
        
        sums.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            runSum += nums[i];
            
            if (sums.containsKey(runSum - k)) {
                count += sums.get(runSum - k);
            }
            
            sums.put(runSum, sums.getOrDefault(runSum, 0) + 1);
        }
        
        return count;
    }
}
