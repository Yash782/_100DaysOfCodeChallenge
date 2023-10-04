package Day_3;

import java.util.Scanner;
//Given an integer input as the number, the objective is to check
// whether, or not the number can be represented as the sum of its factors except the number itself.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(perfectCheck(n)){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not a perfect number");
        }
    }

    static boolean perfectCheck(int n){
        int i;
        int total = 0;
        for (i = 1; i < n; i++) {
            if(n % i==0){
                total = total +i;
            }
        }
        return total == n;
    }
}
