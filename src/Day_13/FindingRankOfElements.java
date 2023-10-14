package Day_13;


import java.util.Arrays;

public class FindingRankOfElements {
    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 12 , 90};
        sortArray(arr);
    }
    static void sortArray(int [] arr){
        int arrLen = arr.length;
        int [] sortedArr = new int[arrLen];
        // Copying old arr elements to new array
        System.arraycopy(arr, 0, sortedArr, 0, arrLen);
        // Sorting the array
        for (int j = 0; j < arrLen; j++) {
            for (int i = j; i < arrLen-1; i++) {
                if(sortedArr[i] > sortedArr[i+1]){
                    int temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Ranks on above given array are: ");
        // Calling rankFinder function and printing ranks according to old array
        for(int n : arr){
            System.out.print(rankFinder(sortedArr , n)+ ", ");
        }
    }
    static int rankFinder(int [] sortedArr, int n){
        for (int i = 0; i < sortedArr.length; i++) {
            if(sortedArr[i] == n){
                return i+1;
            }
        }
        return 0;
    }
}
