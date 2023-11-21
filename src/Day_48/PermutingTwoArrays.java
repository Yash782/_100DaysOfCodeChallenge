package Day_48;

import java.lang.reflect.Array;
import java.util.*;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(2,3,1));
        List<Integer> B = new ArrayList<>(Arrays.asList(8,9,7));
        int k = 10;
        System.out.println(twoArrays(k, A, B));
    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        B.sort(Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) + B.get(i) < k){
                return "NO";
            }
        }
    return "YES";

    }
}
