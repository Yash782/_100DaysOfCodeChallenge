package Day_4;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(checkHarsh(n)){
            System.out.println("Harshad Number");
        }else {
            System.out.println("Not a Harshad Number");
        }
    }
    static boolean checkHarsh(int n){
        int mod;
        int a =0;
        int i = n;
        while (n > 0){
            mod = n % 10;
            a = mod +a;
            n = n/10;
        }
        return i % a == 0;
    }
}
