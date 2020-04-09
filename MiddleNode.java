/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int counter = 1;
        ListNode end = head;
        ListNode mid = end;
        
        while (end.next != null) {
            end = end.next;
            counter++;
            if (counter % 2 == 0) {
                mid = mid.next;
            }
        }
        return mid;
    }
}
