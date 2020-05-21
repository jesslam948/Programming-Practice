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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> myS = new Stack<>();
        TreeNode node = root;
        
        while (node != null) {
            myS.push(node);
            node = node.left;
        }
        
        TreeNode temp;
        
        for (int i = 0; i < k; i++) {
            node = myS.pop();
            if (node.right != null) {
                temp = node.right;
                while (temp != null) {
                    myS.push(temp);
                    temp = temp.left;
                }
            }
        }
        
        return node.val;
    }
}
