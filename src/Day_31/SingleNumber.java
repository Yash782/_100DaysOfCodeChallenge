package Day_31;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(oneForLoop(nums));

    }
    public static int singleNumber(int[] nums) {
        for(int i : nums){
            if(repeatCheck(nums, i)){
                return i;
            }
        }
        return -1;
    }
    static boolean repeatCheck(int [] nums, int n){
        int count = 0;
        for(int i : nums){
            if(n==i){
                count++;
            }
        }
        return count==1;
    }

    static int oneForLoop(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i] != nums[j]){
                    return nums[i];
                }

            }

        }
        return -1;
    }
}
