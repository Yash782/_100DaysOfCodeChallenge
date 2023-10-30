package Day_29;
//https://www.codechef.com/practice/LP1TO201/problems/VDATES
import java.util.Scanner;

public class VaccineDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int d, l, r;
        for (int i = 0; i < t; i++) {
            d = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            if(d<=r && d>=l){
                System.out.println("Take second dose now");
            } else if (d>r && d>l) {
                System.out.println("Too Late");
            }else {
                System.out.println("Too Early");
            }
        }
    }
}
