package Day_29;

import java.util.Scanner;

//https://www.codechef.com/practice/INTARR01/problems/MISSP
public class ChefAndDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int s;
        int count=0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                s = sc.nextInt();
                if(s%2!=0){
                    count++;
                }

            }
        }
        System.out.println(count);

    }

}
