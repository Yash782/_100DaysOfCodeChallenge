package Day_20;
import java.util.HashSet;
//https://leetcode.com/problems/unique-number-of-occurrences/description/
//Beats 98.27%of users with Java

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }
        for(int i : set){
            set2.add(count(arr, i));
        }

        return (set.size()==set2.size());

    }
    static int count(int[] arr, int n){
        int count = 0;
        for(int i : arr){
            if(n == i){
                count++;
            }
        }
        return count;
    }
}
