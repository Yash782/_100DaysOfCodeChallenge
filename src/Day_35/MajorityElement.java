package Day_35;
//https://leetcode.com/problems/majority-element/submissions/1092250714/
import java.util.ArrayList;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int majorCheck = (nums.length-1)/2;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(! list.contains(i)){
                list.add(i);
            }
        }
        for (int j : list) {
            for (int num : nums) {
                if (num == j) {
                    count++;
                    if (count > majorCheck) {
                        return j;
                    }
                }

            }
        }
        return -1;
    }
}
