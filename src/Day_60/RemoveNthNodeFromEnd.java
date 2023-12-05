package Day_60;
//Solved on Leetcode.
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEnd {
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        if(head == null ){
            return head;
        }
        ListNode counter = head;
        ListNode prev = null;
        ListNode current = head;
        int length = 0;

        while(counter !=null){
            counter = counter.next;
            length++;
        }

        for(int i = 1; i < length - n+1; i++){
            prev = current;
            current = current.next;
        }
        if(prev == null){
            current = current.next;
            return current;
        }
        prev.next = current.next;
        return head;
    }*/
}
