package Day_9;

public class LargestInArray {
    public static void main(String[] args) {
        int [] arr = {1,24,4,6,43,36,3,45,79,90};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is: " + max);
    }
}
