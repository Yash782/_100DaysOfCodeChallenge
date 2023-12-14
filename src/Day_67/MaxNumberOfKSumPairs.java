package Day_67;
//https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(arr, k));
    }
    public static int maxOperations(int[] nums, int k) {
        int count=0;

        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if((nums[i] + nums[j]) == k){
                count++;
                i++;
                j--;
            }
            else if((nums[i] + nums[j]) > k){
                j--;
            }
            else{
                i++;
            }

        }
        return count;
    }
}
