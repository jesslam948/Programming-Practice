# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        bfront = dummy
        for i in range(k - 1):
            bfront = bfront.next
        
        fastptr = bfront.next
        bback = dummy
        while fastptr.next is not None:
            fastptr = fastptr.next
            bback = bback.next
        
        front = bfront.next
        nfront = front.next
        back = bback.next
        nback = back.next
        
        bfront.next, bback.next = back, front
        front.next, back.next = back.next, front.next
        
        # if bfront.next == bback:
        #     bfront.next = back
        #     front.next = nback
        #     back.next = front
        #     bback.next = nback
        # elif bback.next == bfront:
        #     bback.next = front
        #     back.next = nfront
        #     front.next = back
        #     bfront.next = nfront
        # else:
        #     bfront.next = back
        #     front.next = nback
        #     bback.next = front
        #     back.next = nfront
        
        return dummy.next
