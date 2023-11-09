package Day_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-sherlock-and-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two

public class SherlockAndArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,6,8,11));
        System.out.println(balancedSums(arr));

    }
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0, currentSum = 0;
        for (Integer num : arr) totalSum += num;

        for (int i = 0; i < arr.size(); i++) {
            totalSum -= arr.get(i);
            if (currentSum == totalSum) {
                return "YES";
            }
            currentSum += arr.get(i);
        }

        return "NO";
    }
}
