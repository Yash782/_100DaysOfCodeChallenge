package Day_72;

import Day_65.ListNode;

import static Day_65.ListNode.constructList;
import static Day_65.ListNode.print;

public class OddEvenLL {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5};
        ListNode ans = constructList(arr);

        print(oddEvenList(ans));

    }
    public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        {
            return head;
        }
        ListNode ptr1=head,ptr2=head.next,ptr3=head.next.next,poin=ptr2;
        ptr1.next=ptr2.next=null;
        int c=1;
        while(ptr3!=null)
        {
            if(c%2==1)
            {
                ptr1.next=ptr3;
                ptr3=ptr3.next;
                ptr1.next.next=null;
                ptr1=ptr1.next;
                c--;
            }
            else
            {
                ptr2.next=ptr3;
                ptr3=ptr3.next;
                ptr2.next.next=null;
                ptr2=ptr2.next;
                c++;
            }
        }
        ptr1.next=poin;
        return head;
    }
}
