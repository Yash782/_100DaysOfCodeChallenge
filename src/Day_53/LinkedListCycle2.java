package Day_53;
//https://leetcode.com/problems/linked-list-cycle-ii/

//This is the code which I solved on LeetCode
//LinkedIn link->
/*
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        for(int i = 0; i< length; i++){
            s = s.next;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
    public int cycleLength(ListNode slow){
        ListNode temp = slow;
        int length = 0;
        do{
            temp = temp.next;
            length ++;
        } while(temp != slow);
        return length;
    }
}
*/
