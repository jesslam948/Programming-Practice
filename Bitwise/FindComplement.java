class Solution {
    public int findComplement(int num) {
        
        int oneNum = 1;
        while (oneNum < num) {
            oneNum = oneNum << 1;
            oneNum++;
        }
        
        return num ^ oneNum;
    }
}
