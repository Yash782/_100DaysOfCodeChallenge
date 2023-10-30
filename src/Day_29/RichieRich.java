package Day_29;
//https://www.codechef.com/practice/LP1TO201/problems/CHFRICH
import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans ;
        int a, b, c;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            ans = (b-a)/c;
            System.out.println(ans);
        }

    }

}
