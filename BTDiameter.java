/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDi = diameterOfBinaryTree(root.left);
        int rightDi = diameterOfBinaryTree(root.right);
        
        return Math.max(Math.max(leftDi, rightDi), getHeight(root.left) + getHeight(root.right));
    }
    
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
