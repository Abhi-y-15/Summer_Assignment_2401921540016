class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d  = new ListNode(-1);
        ListNode i = list1 ,j = list2,k = d;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next = i ;
                i = i.next; 
            }
            else{
                k.next = j;
                j = j.next; 
            }
            k = k.next;
        }
        if(i!=null){
            k.next = i ;
        }
        else{
            k.next = j;
        }
        return d.next;
    }
}