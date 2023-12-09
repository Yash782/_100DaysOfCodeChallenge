package Day_63;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class DeleteDuplicate2 {
    /*public ListNode deleteDuplicates(ListNode head) {
        ListNode tempHead = new ListNode(0, head);
        ListNode prev = tempHead;

        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return tempHead.next;
    }*/
}
