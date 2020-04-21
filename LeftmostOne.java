/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
        List<Integer> dim = binaryMatrix.dimensions();
        
        int left = 0;
        int right = dim.get(1) - 1;
        int leftMost = right;
        boolean hasOne = false;
        
        for (int y = 0; y < dim.get(0); y++) {
            while (left < right) {
                int mid = (left + right) / 2;
                if (binaryMatrix.get(y, mid) == 1) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            if (binaryMatrix.get(y, left) == 1) {
                leftMost = left;
                hasOne = true;
            }
            left = 0;
            right = leftMost;
        }
        
        if (!hasOne) {
            return -1;
        }
        return leftMost;
    }
}
