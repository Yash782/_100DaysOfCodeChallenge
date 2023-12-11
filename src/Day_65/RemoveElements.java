package Day_65;
//https://leetcode.com/problems/remove-nodes-from-linked-list/description/
import static Day_65.ListNode.constructList;
import static Day_65.ListNode.print;

public class RemoveElements {
    public static void main(String[] args) {
        Integer [] arr = {5,2,13,3,8};
        ListNode ans = constructList(arr);

        print(removeNodes(ans));

    }
    public static ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode current = head;
        ListNode nextNode = head;
        int max = head.val;

        while (current != null){
            max = Math.max(max, current.val);
            if(max > current.val){
                nextNode.next = nextNode.next.next;
            }
            else nextNode = current;
            current = current.next;
        }
        return reverse(head);

    }
    public static ListNode reverse (ListNode head)
    {
        ListNode prev=null,cur=head,next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

}
