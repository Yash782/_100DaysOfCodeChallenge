package Day_1;

import java.util.Scanner;
// This program simple tell if the number entered by the user is Palindrome or not
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(paliOrNot(n) == n){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
    static int paliOrNot(int n){
        int a = 0;
        while (n>0){
            int mod = n%10;
            int b = a+mod;
            a = b*10;

            n = n/10;
        }
        return a/10;
    }
}
