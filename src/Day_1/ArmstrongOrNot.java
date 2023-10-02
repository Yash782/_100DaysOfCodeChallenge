package Day_1;

import java.util.Scanner;
// Tells if number given by the user is Armstrong Number or not
public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(armstrong(n) == n){
            System.out.println(n +" is a armstrong number:");
        }else {
            System.out.println(n + " is not a armstrong number: ");
        }
    }

    static int armstrong(int n){

        int cube;
        int add = 0;
        while (n>0){
            int mod = n % 10;
            cube = (int) Math.pow(mod, 3);
            add = cube + add;
            n = n/10;

        }

        return add;
    }
}
