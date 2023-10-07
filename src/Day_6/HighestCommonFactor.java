package Day_6;

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("The HCF: "+ hcf(num1, num2));

    }

    static int hcf(int num1, int num2){
        int hcf =0 ;
        for (int i = 1; i <= num1 || i <= num2 ; i++) {
            if (num1 % i == 0 &&  num2 % i ==0){
                hcf = i;
            }

        }

        return hcf;
    }
}
