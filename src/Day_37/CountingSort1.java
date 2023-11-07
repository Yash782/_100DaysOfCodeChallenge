package Day_37;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-countingsort1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,7,7,8,9,10,11,12);
        System.out.println(countingSort(arr));

    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> ansList = new ArrayList<>();
        int j;
        int [] indexArr = new int[100];
        for (int i : arr) {
            j = i;
            indexArr[j] += 1;
        }
        for(int i : indexArr){
            ansList.add(i);
        }
        return ansList;
    }
}
