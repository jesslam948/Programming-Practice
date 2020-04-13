class Solution {
    public int lastStoneWeight(int[] stones) {
        int x, y;
        
        if (stones.length == 0) {
            return 0;
        }
        else if (stones.length == 1) {
            return stones[0];
        }
        
        int i = stones.length - 1;
        
        Arrays.sort(stones);

        while (stones[i - 1] != 0) {
            y = stones[i];
            x = stones[i - 1];
            if (x == y) {
                stones[i] = 0;
                stones[i - 1] = 0;
            }
            else {
                stones[i] = y - x;
                stones[i - 1] = 0;
            }
            Arrays.sort(stones);
        }
        
        return stones[i];
    }
}
