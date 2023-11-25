package Day_51;

import Day_49.LL;
import org.w3c.dom.Node;

import static Day_49.LL.merge;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = merge(first, second);
        ans.display();
    }

    // This code could be found in Day 49 LL
    // As the variables are private so cannot be used here so here I have just commented the same code which is present there.
    /*public static LL merge(LL first, LL second){
        LL.Node f = first.head;
        LL.Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }*/
}
