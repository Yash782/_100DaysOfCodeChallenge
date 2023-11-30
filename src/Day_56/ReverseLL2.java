package Day_56;
//https://leetcode.com/problems/reverse-linked-list-ii/

//Done on leetcode
public class ReverseLL2 {
    /*public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;

        for(int i = 0; current != null && i<left-1; i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode nextNode = current.next;

        for(int i = 0; current !=null && i<right-left+1; i++){
            current.next = prev;
            prev = current;
            current = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }

        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;*/
}
