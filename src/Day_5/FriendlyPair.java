package Day_5;

import java.util.Scanner;
//Given Two integer inputs as the numbers, the objective is to check whether the ratio of
// the sum of the factors of the number except the number itself upon the number,
// of the both numbers, matches or not.
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();

        if(factorAndAdd(n) /n == factorAndAdd(m) /m){
            System.out.println("Yes, they are a friendly pair");
        }else {
            System.out.println("No, they are not a friendly pair");
        }
    }

    static int factorAndAdd(int num){
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                total = total + i;
            }
        }
        return total;
    }
}
