package Day_15;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Taking the array input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrLength = in.nextInt();
        int [] arr = new int[arrLength];
        System.out.print("Enter sorted array: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = in.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println("Target element found at index: " + ans);

    }

    //Sorting the array taken
    /*static int[] sortingArr(int [] arr2){
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > arr2[i+1]){
                int temp = arr2[i];
                arr2[i] = arr2[i+1];
                arr2[i+1] = temp;
            }
        return arr2;
        }


        return arr2;
    }*/

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            //int mid = (start + end)/2;
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;

            }else if(arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

}