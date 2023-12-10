package Day_64;
//Solved on LeetCode;
//https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesInPairs {
    /*public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tempHead = new ListNode();
        tempHead.next = head;
        swap(tempHead);
        return tempHead.next;
    }
    void swap(ListNode node){
        if(node == null){
            return;
        }
        ListNode first = node.next;
        ListNode second = null;

        if(first != null && first.next != null){
            second = first.next;
            ListNode secondNext = second.next;
            second.next = first;
            node.next = second;
            first.next = secondNext;
            swap(first);
        }
    }*/
}
