class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev =null;
        ListNode s =head;
        ListNode f = head;
        for(int i = 0;i<n;i++){
            f = f.next;
        }
        while(f!=null){
            prev = s;
            s = s.next;
            f = f.next;
        }
        prev.next = s.next.next ;
        return head ;
    }
}