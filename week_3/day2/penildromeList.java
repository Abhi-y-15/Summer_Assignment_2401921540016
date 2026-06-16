class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next == null) return true ;
        
        ListNode s = head;
        ListNode fa = head;

        while(fa!=null&&fa.next!=null){
            s = s.next;
            fa = fa.next.next ;
        }

        ListNode c = s;
        ListNode f = null;
        ListNode p = null;


        while(c!=null){
            f = c.next ;
            c.next = p;
            p = c;
            c = f; 
        }
        ListNode t = head;
        while(p!=null){
            if(t.val != p.val){
                return false;
            }
            t = t.next;
            p = p.next;
        }
        return true;
    }
}