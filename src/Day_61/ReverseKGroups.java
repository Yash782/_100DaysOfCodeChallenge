package Day_61;

public class ReverseKGroups {
    /*public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        int length = 0;

        while(temp.next !=null){
            temp = temp.next;
            length++;
        }
        temp = dummy;

        while(temp.next !=null){
            if(length<k) break;
            int nodes = k-1;
            ListNode tempNext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;

            while(nodes-- > 0){
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
            }
            length-=k;
            temp.next = first;
            tempNext.next = second;
            temp = tempNext;
        }
        return dummy.next;
    }*/
}
