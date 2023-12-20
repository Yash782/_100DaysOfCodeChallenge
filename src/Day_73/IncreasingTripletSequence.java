package Day_73;
//https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IncreasingTripletSequence {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int big : nums) {
            if(big <= i) {
                i = big;
            }
            else if(big <= j) {
                j = big;
            }
            else return true;
        }
        return false;
    }
}
