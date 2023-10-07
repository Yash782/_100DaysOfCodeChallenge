package Day_2;

import java.util.Scanner;
// This program returns the factorial of a number
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }
    static long fact(int n){
         long fac =1;
        
        for (int i = 1; i < n; i++) {
           fac = fac*(i+1);
        }
        return fac;
    }
}
