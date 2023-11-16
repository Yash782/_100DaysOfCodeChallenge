package Day_44;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-angry-children/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two
public class MinMax {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,4,7,2);
        int k = 2;
        System.out.println(maxMin(k, arr));
    }
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        // Sorting
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i =0; i<=arr.size()-k; i++){
            int diff = arr.get(i+k-1) - arr.get(i);
            if(diff<min){
                min = diff;
            }
        }
        return min;

    }
}
