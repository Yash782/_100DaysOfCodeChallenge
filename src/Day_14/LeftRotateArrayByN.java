package Day_14;

import java.util.Arrays;

//In this program we’ll be learning about Java program for rotation of elements of array-left
// and right to a specified number of times. An array is said to be right rotated if all the
// selected elements were  moved towards right by one position.
public class LeftRotateArrayByN {
    public static void main(String[] args) {
        int [] arr = { 10, 20, 30, 40, 50, 60, 70 };

        leftRotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
    static void leftRotate(int[] arr, int n){
        for (int i = 0; i <= n; i++) {
            leftRotateByOne(arr);
        }
    }
    static void leftRotateByOne(int [] arr){
        int len = arr.length;

        for (int i = 0; i < len-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
