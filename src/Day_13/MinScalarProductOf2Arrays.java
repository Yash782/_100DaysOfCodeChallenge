package Day_13;

import java.util.Arrays;

public class MinScalarProductOf2Arrays {
    public static void main(String[] args) {
        // Both arrays must be of same length
        int [] arr1 = {10, 30, 40, 20};
        int [] arr2 = {2, 4, 5, 1};
        System.out.println(minScalarProduct(arr1, arr2));
    }
    static int minScalarProduct(int [] arr1, int [] arr2){
        int scalarProduct = 0;
        // Both arrays so we can easily multiply
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j = arr1.length-1;
        int i = 0;
        // Now we can iterate one array from start to end and another end to start
        while(j >= 0){
            scalarProduct = arr1[i] * arr2[j] + scalarProduct;
            j --;
            i ++;
        }

        return scalarProduct;
    }
}
