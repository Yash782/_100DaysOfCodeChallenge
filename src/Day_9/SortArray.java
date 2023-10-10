package Day_9;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr = {1,24,4,6,43,36,3,45,79,90};

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j+1] < arr[j] ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
