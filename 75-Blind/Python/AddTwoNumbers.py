# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        result = 0
        power = 0
        
        while l1 and l2:
            result += (l1.val + l2.val) * (10 ** power)
            power += 1
            l1 = l1.next
            l2 = l2.next
        
        while l1:
            result += l1.val * (10 ** power)
            power += 1
            l1 = l1.next
        
        while l2:
            result += l2.val * (10 ** power)
            power += 1
            l2 = l2.next
        
        result_inv = str(result)[::-1]
        
        ans = ListNode(0, None)
        curr = ans
        
        for c in result_inv:
            curr.next = ListNode(0, None)
            curr = curr.next
            curr.val = int(c)
        
        return ans.next
    
    
    
#         result = ListNode(0, None)
#         curr = result
#         carry = 0
        
#         while l1 and l2:
#             temp = l1.val + l2.val
#             curr.val = (temp % 10) + carry
#             carry = temp // 10
            
#             if l1.next or l2.next:
#                 curr.next = ListNode(0, None)
#                 curr = curr.next
            
#             l1 = l1.next
#             l2 = l2.next
        
#         while l1:
#             temp = l1.val
#             curr.val = (temp % 10) + carry
#             carry = temp // 10
            
#             if l1.next:
#                 curr.next = ListNode(0, None)
#                 curr = curr.next
            
#             l1 = l1.next
            
#         while l2:
#             temp = l2.val
#             curr.val = (temp % 10) + carry
#             carry = temp // 10
            
#             if l2.next:
#                 curr.next = ListNode(0, None)
#                 curr = curr.next
            
#             l2 = l2.next
        
#         if carry != 0:
#             curr.next = ListNode(carry, None)
        
#         return result
