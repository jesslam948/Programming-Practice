class Solution {
    public int consecutiveNumbersSum(int N) {
        
        int result = 1; // N is a consec num sum of itself
        
        // i is the number of consecutive numbers in a possible sequence
        // starts at 2 bc we know N works
        // ends at (i * (i + 1)) / 2 == N bc the i maxes out when k = 0, meaning N = sum of 1 to i
        for (int i = 2; (i * (i + 1)) / 2 <= N; i++) {
            int midVal = N - (i * (i + 1)) / 2;
            if (midVal % i == 0) {
                result++;
            }
        }
        
        return result;
    }
    
    /**
    Certainties:
        N = (k + 1) + (k + 2) + (k + 3) + ... + (k + i)
        this can be reduced to
        N = (i * k) + sum (1 to i)
        N = (i * k) + (i * (i + 1)) / 2
        solving for possible k's
        N - (i * (i + 1)) / 2 = i * k
        (N - (i * i + 1)) / 2 ) / i = k
    **/
}
