package Day_28;

// Only works for arrays which are sorted in ascending order;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] nums = {1,23,43,54,65,75,84,86,90,95,100};
        int target = 23;

        //Calling the ceiling function
        int ans = ceiling(nums, target);
        if(ans == -1){
            System.out.println("The target exceeds the max element in array");
        }else {
            System.out.println(ans);
        }

    }
    //Return the number => target
    static int ceiling(int[] nums, int target) {
        //Initialized start and end variables;
        int start = 0;
        int end = nums.length-1;

        if(target > nums[nums.length-1]){
            return -1;
        }
        while(start <= end){

            //int mid = (start + end)/2;
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;

            }else if(nums[mid] == target) {
                return nums[mid];
            }
        }
        return nums[start];
    }
}
