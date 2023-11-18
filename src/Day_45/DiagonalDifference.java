package Day_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-diagonal-difference/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
public class DiagonalDifference {
    public static void main(String[] args) {
        ArrayList<List<Integer>> group = new ArrayList<List<Integer>>();
        group.add(Arrays.asList(1, 2, 3));
        group.add(Arrays.asList(4, 5, 6));
        group.add(Arrays.asList(9, 8, 9));

        System.out.println(diagonalDifference(group));
    }
    public static int diagonalDifference(List<List<Integer>> arr){
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            secondDiagonal += arr.get(i).get(arr.size()-(i+1));
            
        }
        return Math.abs(firstDiagonal-secondDiagonal);
    }

}
