package Day_77;
//https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]==0)
                k--;
            if(k<0&&nums[j++]==0)
                k++;
            i++;
        }
        return i-j;
    }
}
