package Day_7;

import java.util.Scanner;

public class LeapYrOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(leap(n)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap ");
        }

    }
    static boolean leap(int n){
        return n % 400 == 0 && n % 4 == 0 && n % 100 != 0;
    }
}
