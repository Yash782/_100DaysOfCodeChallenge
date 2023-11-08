package Day_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two

public class SalesByMatch {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> arr =  new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        System.out.println(sockMerchant(n, arr));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : ar){
            set.add(i);
        }

        for(int i : set){
            int j = countSock(i, ar);
            //System.out.println(j);
            pairs = j/2 + pairs;
        }
        return pairs;

    }
    public static int countSock(int n,List<Integer> ar ){
        int count = 0;
        for(int i : ar){
            if(n == i){
                count++;
            }
        }
        return count;
    }
}
