package Day_10;

import java.util.Arrays;

//Java Program for Sorting first half of array in Ascending order and
// second half in Descending order
public class HalfAsceHalfDesc {
    public static void main(String[] args) {
        // 1,2,3,4,10,9,8,7,6
        int [] arr = {1,24,4,6,43,36,3,45,79,90,100};
        //printingMethod(arr);
        bubbleSort(arr);
    }
    static void printingMethod(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j+1] < arr[j] ){
                    swapNums(arr, arr[j], arr[j+1]);
                }
            }
        }
        System.out.println("----From Printing Method----");
        for (int i = 0; i < arr.length /2 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = arr.length-1 ; i > (arr.length / 2); i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ");
    }

    static void bubbleSort(int [] arr){
        int n = arr.length/2+1;


        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]){
                    swapNums(arr, j, j+1);
                }

            }
        }
        for (int i = n; i < arr.length; i++) {
            for (int j = arr.length-1; j >= n; j--) {
                if(arr[j] > arr[j-1]){
                    swapNums(arr, j, j-1);
                }

            }
        }
        System.out.println("----From Bubble Sort----");
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNums(int []arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }
}
