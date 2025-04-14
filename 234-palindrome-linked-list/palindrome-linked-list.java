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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr; //update
            curr = next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode sp = head;
        ListNode fp = head;
        while(fp.next != null && fp.next.next != null){
            sp = sp.next;
            fp = fp.next.next;
        }
        return sp;
    }
    public boolean isPalindrome(ListNode head) {
      if(head == null || head.next == null){
        return true;
      } 
      ListNode middle = findMiddle(head);
      ListNode shs = reverse(middle.next);
      ListNode fhs = head; // fhs = first half start
      while(shs != null){  // shs = second half start
        if(fhs.val != shs.val){
            return false;
        }
        fhs = fhs.next;
        shs = shs.next;
      } 
      return true;
    }
}