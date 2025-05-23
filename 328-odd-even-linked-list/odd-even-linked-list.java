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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next; // odd to next odd
            odd = odd.next;
           even.next = odd.next; // even to next even
           even = even.next;
          }
          odd.next = evenHead; // connect odd to even
          return head;

    }
}