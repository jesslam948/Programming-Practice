# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.checkBST(root, float("-inf"), float("inf"))
        
    def checkBST(self, node: TreeNode, min_val:int, max_val: int):
        if node == None:
            return True
        
        if node.val <= min_val or node.val >= max_val:
            return False
        else:
            return self.checkBST(node.left, min_val, node.val) and self.checkBST(node.right, node.val, max_val)

# Conditions to meet:
# all nodes in the left subtree must be less than the node's value
# all nodes in the right subtree must be greater than the node's value
# both left & right subtrees need to be valid
