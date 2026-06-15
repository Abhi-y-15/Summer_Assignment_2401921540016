package week_3.day1;
class Solution {

    
    public ListNode reverseList(ListNode head) {


        //Iterative way
        // ListNode f = head ;
        // ListNode c = head ;
        // ListNode p = null;
        // while(c!=null){
        //     f = c.next ;
        //     c.next = p ;
        //     p = c ;
        //     c = f ;
        // }
        // return p ;



        //recursive method
        if(head==null||head.next==null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;
    }
}