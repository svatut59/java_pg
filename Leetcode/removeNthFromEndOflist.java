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
       int size = 1;
        ListNode current = head;
        while (current.next!=null) {
            current = current.next;
            size++;
            System.out.println(size);
        }
        if (size == n) {
            current = head.next;
            return current;
        }
        int target = size - n;
        int count = 0;
        current = head;
        while (count<target-1) {
            current = current.next;
            count++;
        }
        if (current.next!=null) {
            current.next = current.next.next;
            }
        else {
            current.next = null;
        }
        return head;
    }
}