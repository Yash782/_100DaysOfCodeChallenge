package Day_10;

import java.util.ArrayList;


public class FindCountOfEveryElement {
    public static void main(String[] args) {
        int [] arr = {10,30,20,30,10,30,45,45,55,60};

        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to unique array:
        for (int j : arr) {
            if (elementCheck(list, j)) {
                list.add(j);
            }
        }

        // Calling function for checking occurrence
        for (int n : list) {
            System.out.println(n + " is present " + countCheck(arr, n) + " times");
        }

    }
    // Checking if element is unique or not
    static boolean elementCheck(ArrayList<Integer> list , int n){
        for (Integer integer : list) {
            if (n == integer) {
                return false;
            }
        }
        return true;
    }
    // Counting the occurrence of given element
    static int countCheck( int[] arr, int n){
        int count = 0;
        for (int j : arr) {
            if (n == j) {
                count++;
            }
        }
        return count;
    }
}
