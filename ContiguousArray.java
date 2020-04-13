class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int max = 0;
        int counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                counter--;
            } else {
                counter++;
            }
            if (map.containsKey(counter)) {
                max = Math.max(max, i - map.get(counter));
            }
            else {
                map.put(counter, i);
            }
        }
        
        return max;
    }
}
