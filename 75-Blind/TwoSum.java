class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solutions = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        int comp;
        for (int i = 0; i < nums.length; i++) {
            comp = target - nums[i];
            if (myMap.containsKey(comp)) {
                solutions[0] = i;
                solutions[1] = myMap.get(comp);
                break;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return solutions;
    }
}
