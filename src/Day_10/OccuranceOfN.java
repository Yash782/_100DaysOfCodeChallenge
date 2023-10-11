package Day_10;

import java.util.Scanner;

public class OccuranceOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,24,4,6,43,36,3,45,79,90,100,3,3};
        System.out.print("Enter a number to search: ");
        int n = sc.nextInt();
        System.out.println(findNum(n, arr));
    }
    static int findNum(int n, int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                count++;
            }

        }
        return count;
    }
}
