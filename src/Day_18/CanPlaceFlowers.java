package Day_18;
//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1};
        //1,0,0,0,1,0,1
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
    public static boolean canPlaceFlowers(int[] arr, int n) {
        int count = n;
        int [] flowerbed = new int [arr.length+2];
        for (int i = 0; i < flowerbed.length-2; i++) {
            flowerbed[0] = 0;
            flowerbed[flowerbed.length-1] = 0;
            flowerbed[i+1] = arr[i];
        }
        for (int i = 0; i < flowerbed.length-1; i++) {
            if(flowerbed[0] == 0){
                flowerbed[0] = 1;
                count--;
            }
            else if(i!=0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1 && flowerbed[i] != 1){
                flowerbed[i] = 1;
                count--;
            }
        }
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }
}