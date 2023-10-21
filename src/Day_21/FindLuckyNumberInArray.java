package Day_21;
import java.util.HashSet;
//https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
//Beats 78.47%of users with Java

public class FindLuckyNumberInArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,3,3};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int lucky = -1;
        for(int i : arr){
            set.add(i);
        }
        for(int i : set){
            if(i == countElements(arr, i)){
                //lucky = Math.max(lucky, i);
                if(i > lucky){
                    lucky = i;
                }
            }
        }
        return lucky;
    }
    static int countElements(int [] arr, int n){
        int count = 0;
        for(int i : arr){
            if( n == i){
                count++;
            }
        }
        return count;
    }
}
