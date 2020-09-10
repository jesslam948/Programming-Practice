class Solution {
    public int climbStairs(int n) {
        List<Integer> dp = new ArrayList<>();
        
        dp.add(0); 
        dp.add(1);
        dp.add(2);
        
        for (int i = 3; i <= n; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2));
        }
        
        return dp.get(n);
    }
}

//         // original recursive solution used to figure out dp solution
//         // base case
//         if (n == 0) {
//             return 0;
//         } else if (n == 1) {
//             return 1;
//         } else if (n == 2) {
//             return 2;
//         }
        
//         return climbStairs(n - 1) + climbStairs(n - 2);
