 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        
        add(root, preorder, 1);
        
        return root;
    }
    
    public static void add(TreeNode temp, int val) {
        if (temp != null) {
            while ((val < temp.val && temp.left != null) || (val > temp.val && temp.right != null)) {
                if (val < temp.val && temp.left != null) {
                    temp = temp.left;
                }
                if (val > temp.val && temp.right != null) {
                    temp = temp.right;
                }
            }

            if (val < temp.val) {
                temp.left = new TreeNode(val);
            }
            else {
                temp.right = new TreeNode(val);
            }
        }
    }
}
