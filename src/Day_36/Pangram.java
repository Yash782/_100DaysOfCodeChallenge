package Day_36;

import java.util.ArrayList;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-pangrams/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-month-week-one

public class Pangram {
    public static void main(String[] args) {
        String s = "A a  brown fox jumps over the lazy dog";
        System.out.println(pangrams(s));
    }
    public static String pangrams(String s) {
        // Write your code here
        ArrayList<Integer> asciiList =  new ArrayList<>();

        String str = s.toLowerCase();
        char[] charArray = str.toCharArray();

        for (int i : charArray){
            if(i!=32 && !asciiList.contains(i)){
                asciiList.add(i);
            }
        }
        //Sorting the unique charecter list
        if(asciiList.size()==26){
            return "pangram";
        }else{
            return "not pangram";
        }
    }
}
