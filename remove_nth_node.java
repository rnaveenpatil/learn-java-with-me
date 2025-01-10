class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int idxserch=size-n;
       ListNode prev=head;
        int i=1; 
        while(i<idxserch){
            prev=prev.next;
              i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
