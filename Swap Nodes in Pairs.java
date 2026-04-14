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
    public ListNode swapPairs(ListNode head) {
        ListNode n=head;
        while(n!=null&&n.next!=null){
        int temp=n.val;
        n.val=n.next.val;
        n.next.val=temp;
        n=n.next.next;
    }
    return head;}
}
