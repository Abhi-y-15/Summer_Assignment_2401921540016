package week_3.day1;

class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode s =head ;
        ListNode f = head;
        while(f!=null&&f.next!=null){
            f = f.next.next ;
            s = s.next;
        }
        return s;
    }
}