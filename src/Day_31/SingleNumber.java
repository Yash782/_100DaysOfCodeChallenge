package Day_31;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(singleNumber(nums));

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
}
