package Day_8;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        char s;
        int j = str.length();
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i);
            str2 = s + str2;
        }
        System.out.println(str2);
    }
}
