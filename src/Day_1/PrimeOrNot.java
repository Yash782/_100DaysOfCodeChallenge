package Day_1;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();

        System.out.println(prime(n));
    }
    static boolean prime(int n){
        for (int i = 2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
