class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode head = l;
        
        int sum = 0;
        
        while(l1!=null || l2!=null || sum>0){            
            if(l1!=null){
               sum +=l1.val;
                l1=l1.next;
            }                
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }            
            l.val = sum%10;
            sum /=10;
            if(sum==0 && l1==null && l2==null){
                l.next=null;
                break;
            }
            l.next = new ListNode();
            l=l.next;
        }       
        return head;        
    }
}