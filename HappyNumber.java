class Solution {
    public boolean isHappy(int n) {
        int temp = 0;
        int ans = n;
        HashSet seen = new HashSet();
        boolean isNotLoop = true;
        
        while (ans != 1 && isNotLoop) {
            isNotLoop = seen.add(new Integer(ans));
            while (ans > 0) {
                temp += (ans % 10) * (ans % 10);
                ans /= 10;
            }
            ans = temp;
            temp = 0;
        }
        
        if (ans == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
