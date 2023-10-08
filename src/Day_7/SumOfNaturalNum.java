package Day_7;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
    static int sum(int n){
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = i + total;
        }

        return total;

    }
}
