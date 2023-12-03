package Day_58;
//https://leetcode.com/problems/reorder-list/submissions/1111622371/
//Solved on leetcode
public class ReOrderList {
   /* public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode head1 = head;
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);

        while(head2 != null && head1 != null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;

        }
        if(head1 != null){
            head1.next = null;
        }
    }

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode nextNode = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }
        return prev;
    }*/
}
