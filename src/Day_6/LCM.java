package Day_6;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("LCM = "+ findLCM(num1, num2));
    }
    static int findLCM(int num1, int num2){
        int LCM = 0;
        for (int i = 0; i <=10; i++) {
            if (i * num1 == i * num2){
                LCM = i;
            }


        }
        return LCM;
    }
}
