package Day_13;

import java.util.Arrays;

// In this java program we are replacing elements of original array with its rank.
// Smallest element will have the highest rank i.e 1;
public class ReplaceElementWithItsRank {
    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 12 , 90};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array replaced with rank:");
        replaceWithRank(arr);
        // This is a trail commit

    }
    static void replaceWithRank(int [] arr){
        int len = arr.length;
        int [] arr2 = new int[len];
        // Copying elements of arr to arr2
        System.arraycopy(arr, 0, arr2, 0, len);
        // Sorting arr2
        Arrays.sort(arr2);

        // Iterating over i (elements of arr and replacing with rank)
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(arr[i] == arr2[j]){
                    arr[i] = j+1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
