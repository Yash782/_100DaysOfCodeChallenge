package Day_78;

import Day_65.ListNode;

import static Day_65.ListNode.constructList;
import static Day_65.ListNode.print;
//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public static void main(String[] args) {
        Integer [] arr1 = {2,4,3};
        Integer [] arr2 = {5,6,4};

        ListNode L1 = constructList(arr1);
        ListNode L2 = constructList(arr2);
        print(addTwoNumbers(L1, L2));


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        int sum=0;
        int carry =0;
        while(l1!=null || l2!=null) {
            if(l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            ListNode nex = new ListNode(sum%10);
            t.next = nex;
            t=nex;
            carry = sum/10;
            sum=0;
        }
        if(carry ==1) {
            ListNode nex = new ListNode(carry);
            t.next = nex;
            t=nex;
        }
        return ans.next;
    }
}
