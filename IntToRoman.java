class Solution {
    
    public String intToRoman(int num) {
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int k = 0;
        while (num < vals[k]) {
            k++;
        }
        
        String result = "";
        while (num > 0) {
            int temp = num / vals[k];
            for (int i = 0; i < temp; i++) {
                result += roms[k];
                num -= vals[k];
            }
            k++;
        }
        
        return result;
    }
}
