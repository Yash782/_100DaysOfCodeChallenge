package Day_66;
//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
import Day_65.ListNode;

import static Day_65.ListNode.constructList;
import static Day_65.ListNode.print;

public class InsertGCD {
    public static void main(String[] args) {

        Integer [] arr = {5,2,13,3,8};
        ListNode ans = constructList(arr);

        print(insertGreatestCommonDivisors(ans));


    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null){
            int curr1=slow.val;int curr2=fast.val;
            ListNode temp=new ListNode(gcd(curr1,curr2));
            slow.next=temp;
            temp.next=fast;
            slow=fast;
            fast=fast.next;
        }
        return head;
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
