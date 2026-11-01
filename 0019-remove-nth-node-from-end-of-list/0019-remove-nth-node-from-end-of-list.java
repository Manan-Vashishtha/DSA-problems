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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode curr2 = dummy;
        int count = 0;
        while(curr != null){
            count++;
            curr=curr.next;
        }
        int c = 0;
        curr = head;
        while(curr != null){
            if(c != count-n){
                curr2.next = curr;
                curr2 = curr2.next;
            }
            c++;
            curr = curr.next;
        }
        curr2.next = null;
        return dummy.next;
    }
}