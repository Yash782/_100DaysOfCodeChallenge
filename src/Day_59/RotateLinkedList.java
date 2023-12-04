package Day_59;
//https://leetcode.com/problems/rotate-list/

//Solved on leetcode;
public class RotateLinkedList {
    /*public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k<=0){
            return head;
        }

        ListNode current = head;
        ListNode tempHead = head;
        int length = 1;

        while(current.next != null){
            current = current.next;
            length++;
        }
        current.next = head;
        int rotations = k % length;
        int newEnd = length - rotations;

        for(int i = 0; i< newEnd-1; i++){
            tempHead = tempHead.next;
        }
        head = tempHead.next;
        tempHead.next = null;
        return head;
    }*/
}
