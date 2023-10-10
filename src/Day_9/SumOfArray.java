package Day_9;

public class SumOfArray {
    public static void main(String[] args) {
        int [] arr = {1,24,4,6,43,36,3,45,79,90};
        int sum = 0;
        for(int i : arr){
            sum = arr[i] + sum;
        }
        System.out.println("Sum of all elements is = " + sum);
    }
}
