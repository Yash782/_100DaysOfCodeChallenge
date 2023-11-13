package Day_41;

import java.util.ArrayList;

//https://www.hackerrank.com/challenges/one-month-preparation-kit-drawing-book/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two
public class DrawingBook {
    public static void main(String[] args) {
        int n = 6;
        int p = 2;
        System.out.println(pageCount(n,p));
    }
    public static int pageCount(int n, int p) {

        return Math.min(p/2, (n/2-p/2));
    }
}