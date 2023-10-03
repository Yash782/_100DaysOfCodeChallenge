package Day_2;

import java.util.Scanner;

public class NthFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(nthFibo(n));
    }
    static int nthFibo(int n){
        int a = 0;
        int b = 1;


        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            for(int i=1; i< n; i++){
                int c = a + b;
                a = b;
                b = c;

            }
            return a;
        }
    }
}
