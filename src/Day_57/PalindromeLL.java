package Day_57;
//https://leetcode.com/problems/palindrome-linked-list/

//Solved on leetcode;
public class PalindromeLL {
   /* public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode tempHead = reverseList(mid);
        ListNode reverseHead = tempHead;

        while(head != null && tempHead != null){
            if(head.val != tempHead.val){
                break;
            }
            head = head.next;
            tempHead = tempHead.next;
        }
        reverseList(reverseHead);

        return head == null || tempHead == null;
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
    }

    public ListNode middleNode(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }*/
}
