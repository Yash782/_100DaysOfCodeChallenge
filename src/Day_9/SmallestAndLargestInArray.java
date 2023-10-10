package Day_9;

public class SmallestAndLargestInArray {
    public static void main(String[] args) {
        int [] arr = {1,24,4,6,43,36,3,45,79,90};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = "+ max);
    }
}
