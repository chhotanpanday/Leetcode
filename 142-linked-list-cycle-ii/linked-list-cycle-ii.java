/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;
        boolean isCycle = false;

        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                isCycle = true;
                break;
            }
        }
        if(! isCycle){
            return null;
        }
        sp = head;
        while(sp != fp){
            sp = sp.next;
            fp = fp.next;
        }
        return sp;
    }
}