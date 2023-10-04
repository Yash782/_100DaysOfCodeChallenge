package Day_3;

import java.util.Scanner;
//Given an integer  input the objective is to check whether, or not the number is a strong number.
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        System.out.println(strongCheck(n));

    }
    static boolean strongCheck(int n){

        int totalFac = 0;
        int mod;
        int i = n;


        while (i > 0){
            mod = i % 10;
            int ans = factorial(mod);
            totalFac = totalFac + ans;

            i =i / 10;
        }
        return totalFac == n;
    }

    static int factorial(int n){
        int fac = 1;
        for (int i = 1; i < n; i++) {
            fac = fac * (i+1);
        }
        return fac;
    }

}
