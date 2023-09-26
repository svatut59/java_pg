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
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode newHead =swapPair(head);
        ListNode current = newHead.next;
        while (current.next!=null && current.next.next !=null && current!=null) {
        current.next = swapPair(current.next);
        current = current.next.next;
        }
        return newHead;
    }
    
    
    private ListNode swapPair(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode newHead = head.next;
        ListNode temp = head.next.next;
        newHead.next = head;
        newHead.next.next = temp;
        return newHead;
    }
}