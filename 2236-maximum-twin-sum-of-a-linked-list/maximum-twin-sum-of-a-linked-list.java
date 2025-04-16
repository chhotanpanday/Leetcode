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
    public int pairSum(ListNode head) {
        if(head == null){
            return 0;
        }
        ListNode sp = head; // find middle
        ListNode fp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        //reverse second of half
        ListNode prev = null;
        ListNode curr = sp;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;// update
            curr = next;
        }
        int maxSum =0;
        ListNode first = head;
        ListNode second = prev; // head of the reverse
        while(second != null){
            maxSum = Math.max(maxSum, first.val + second.val);
            first = first.next;
            second = second.next;
        }
        return maxSum;
    }
}