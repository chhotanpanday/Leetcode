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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode sp = head;
        ListNode fp = head;
        ListNode curr = head;

        while(fp != null && fp.next != null){
            curr = sp;
             fp = fp.next.next;
             sp = sp.next;
           
        }
        curr.next = sp.next;
        return head;
    }
}