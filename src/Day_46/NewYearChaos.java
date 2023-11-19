package Day_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-new-year-chaos/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-three

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>(Arrays.asList(4,3,2,1));
        minimumBribes(q);
    }
    public static void minimumBribes(List<Integer> q) {
        int swaps=0;
        for (int index = q.size()-1; index >= 0; index--) {
            int rightValue = index+1;
            if (q.get(index) != rightValue) {
                if ((index-1) >= 0 && q.get(index-1) == rightValue) {
                    q.set(index-1, q.get(index));
                    q.set(index, rightValue);
                    swaps += 1;
                } else if ((index-2) >= 0 && q.get(index-2) == rightValue) {
                    q.set(index-2, q.get(index-1));
                    q.set(index-1, q.get(index));
                    q.set(index, rightValue);
                    swaps += 2;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swaps);

    }

}
