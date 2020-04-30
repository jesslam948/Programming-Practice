/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isSeq(root, 0, arr);
    }
    
    private boolean isSeq(TreeNode node, int ind, int[] arr) {
        if (node == null || ind > arr.length - 1) {
            return false;
        }
        
        if (node.val != arr[ind]) {
            return false;
        }
        
        if (node.left == null && node.right == null && ind == arr.length - 1) {
            return true;
        }
        
        return isSeq(node.left, ind + 1, arr) || isSeq(node.right, ind + 1, arr);
    }
}
