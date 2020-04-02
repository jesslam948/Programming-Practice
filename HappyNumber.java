class Solution {
    public boolean isHappy(int n) {
        int temp = 0;
        int ans = n;
        int counter = 0;
        
        while (ans != 1 && counter < 10) {
            while (ans > 0) {
                temp += (ans % 10) * (ans % 10);
                ans /= 10;
            }
            ans = temp;
            temp = 0;
            counter++;
        }
        
        if (ans == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
