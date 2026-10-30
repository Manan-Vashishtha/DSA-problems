/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr1 = head;
        ListNode dummy = new ListNode(0);
        ListNode curr2 = dummy;
        while (curr1 != null) {
            if (curr1.val != val) {
                curr2.next = curr1;
                curr2 = curr2.next;
            }
            curr1 = curr1.next;
        }
        curr2.next = null;
        return dummy.next;
    }
}