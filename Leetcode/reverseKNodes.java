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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode newHead =reverseGroup(head, k);
        ListNode current = newHead;
        int i = 1;
        while (current.next!=null) {
        if (i%k==0) {
        current.next = reverseGroup(current.next, k);
        }
        current = current.next;
        i++;
        }
        return newHead;
    }
    
    
    private ListNode reverseGroup(ListNode head, int k) {
        if (head == null) return null;
        if (k==1) return head;
        int i =1;
        ListNode newHead = head;
        while (i<k && newHead.next!=null) {
            newHead = newHead.next; 
            i++;
        }
        if (i<k) return head;
        ListNode temp = head;
        ListNode temp2 = head.next;
        temp.next = newHead.next;
        while (temp2!=newHead) {
            ListNode temp3 = temp2.next;
            temp2.next = temp;
            temp = temp2;
            temp2 = temp3;
        }       
        temp2.next = temp;
        return newHead;
    }
}