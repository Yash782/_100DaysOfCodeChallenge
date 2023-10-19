package Day_18;
//https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};

        moveZeroesForLoopApproach(nums);

        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroesForLoopApproach(int[] nums) {

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j < nums.length-1; j++) {
                if(nums[j] == 0){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }

        }
    }
}
