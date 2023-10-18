package Day_17;

import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/?envType=study-plan-v2&envId=leetcode-75

//Beats 94.17%of users with Java
public class KidWithGreatestCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = 0;
        List<Boolean> result = new LinkedList<>();

        for(int i : candies){
            if(i > max){
                max = i;
            }
        }
         System.out.println(max);

        for (int j : candies){
            if(j + extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
        }

        return result;
     }
}
