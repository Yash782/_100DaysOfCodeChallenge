package Day_32;
//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i <n ; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
