package Day_2;

import java.util.Scanner;
// Prints the fibonacci number till the nth number (user input)
public class FibonacciTill_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(0);

        for(int i=1; i< n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }
}
