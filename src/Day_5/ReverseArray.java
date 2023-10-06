package Day_5;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Declare
        int [] arr = {10,20,30,40,50,60};

        int i = arr.length-1;
        int len = arr.length;
        // Initialize
        int [] ans= new int[len];
        int j =0;
        while (i >= 0 ){
            ans[j] = arr[i];
            j++;
            i-- ;
        }
        System.out.println(Arrays.toString(ans));
    }
}
