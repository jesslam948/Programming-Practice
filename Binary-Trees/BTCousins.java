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
    int parent;
    public boolean isCousins(TreeNode root, int x, int y) {
        // if (depth(root, x) != depth(root,y)) {
        //     return false;
        // }
        int myX = depth(root, x);
        int parentX = this.parent;
        
        int myY = depth(root, y);
        int parentY = this.parent;
        
        if (myX != myY) {
            return false;
        } else if (parentX == parentY) {
            return false;
        }
        return true;
    }
    
    int depth(TreeNode node, int val) {
        if (node.left != null && node.left.val == val) {
            parent = node.val;
            return 1;
        } else if (node.right != null && node.right.val == val) {
            parent = node.val;
            return 1;
        } else if (node.left == null && node.right == null) {
            return 0;
        }
        
        if (node.left != null) {
            int left = depth(node.left, val);
            if (left != 0) {
                return 1 + left;
            }
        }
        
        if (node.right != null) {
            int right = depth(node.right, val);
            if (right != 0) {
                return 1 + right;
            }
        }
        
        return 0;
    }
}
