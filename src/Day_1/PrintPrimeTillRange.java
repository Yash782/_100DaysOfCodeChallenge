package Day_1;

import java.util.Scanner;
// This program prints the prime number until the number entered by the user
public class PrintPrimeTillRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();

        for(int i = 2; i<=n; i++){
            //prime(i);
            if (prime(i)){
                System.out.print(i+ ", ");
            }
        }
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
