package Day_2;

import java.util.Scanner;
//Given two integers as the number and power inputs,
// the objective is to raise the number input to the power input and print the value.
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        //System.out.println(hardMethod(num, power));
        //System.out.println(functionMethod(num, power));
        System.out.println(usingWhile(num, power));
    }

    // Using for loop
   static int hardMethod(int num, int power){
       int ans = 1;
       for (int i = 0; i < power; i++) {
          ans = ans * num;
       }
       return ans;
   }
   // This method uses Math.pow function
   static double functionMethod(int num, int power){

       return Math.pow(num, power);
   }
   // Using while loop
    static int usingWhile(int num, int power){
        int ans = 1;
        while (power !=0){
            ans = ans * num;
            power --;
        }
        return ans;
    }

}
