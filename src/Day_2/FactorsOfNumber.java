package Day_2;

import java.util.Scanner;
// Program to calculate factors of positive number
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        factor(num);
    }
    static void factor(int n ){
        System.out.println("Factors of "+ n + "are");

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
