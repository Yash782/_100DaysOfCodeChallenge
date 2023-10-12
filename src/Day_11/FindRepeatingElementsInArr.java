package Day_11;

import java.util.Arrays;

public class FindRepeatingElementsInArr {
    public static void main(String[] args) {
        int [] arr = {10, 30, 30, 20, 10, 20, 50, 10,10};
        int n = arr.length;
        System.out.println("Repeated elements are: ");
        countFreq(arr, n);

    }
    static void countFreq(int[] arr, int n){
        boolean [] visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if(visited[i]){
                continue;
            }

            int count = 0;
            for (int j = i; j < n; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count ++;
                }
            }
            if(count !=1){
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
