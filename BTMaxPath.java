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
    int globalMax;
    
    public int maxPathSum(TreeNode root) {
        globalMax = root.val;
        sum(root);
        return globalMax;
    }
    
    private int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int lSum = sum(node.left);
        int rSum = sum(node.right);
        
        int straightSum = Math.max(Math.max(lSum, rSum) + node.val, node.val);
        globalMax = Math.max(Math.max(straightSum, lSum + rSum + node.val), globalMax);
        
        return straightSum;
    }
}
