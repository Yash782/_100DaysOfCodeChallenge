package Day_8;

import java.util.Scanner;

public class SumOfNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int s = sc.nextInt();
        System.out.print("Enter end: ");
        int e = sc.nextInt();
        System.out.print("Sum is: ");
        System.out.println(sumInRange(s,e));
    }
    static int sumInRange(int start, int end){
        int total = 0;
        for (int i = start; i <= end; i++) {
            total = i + total;
        }

        return total;

    }
}
