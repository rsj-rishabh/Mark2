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
    public boolean hasCycle(ListNode head) {
        ListNode i = head;
        if(i == null || i.next == null){
            return false;
        }
        ListNode j = head.next;
        while(i != j || i != null || j != null){
            i = i.next;
            j = j.next;
            if(j!=null){
                j  = j.next;
            }
        }
        if(i == null || j == null){
            return false;
        } else {
            return true;
        }
    }
}
