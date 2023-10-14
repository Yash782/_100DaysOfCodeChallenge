package Day_13;

import java.util.Arrays;

public class MaxScalarProductOf2Arrays {
    public static void main(String[] args) {
        int [] arr1 = {10, 30, 40, 20};
        int [] arr2 = {2, 4, 5, 1};
        System.out.println(maxScalarProduct(arr1, arr2));
    }
    static int maxScalarProduct(int [] arr1, int [] arr2){
        int scalarProduct = 0;
        // Sorting Both arrays so we can easily multiply
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j = arr1.length-1;
        // Now we can iterate both arrays from end to start and multiply and add them
        while(j >= 0){
            scalarProduct = arr1[j] * arr2[j] + scalarProduct;
            j --;
        }
        return scalarProduct;
    }
}
