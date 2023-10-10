package Day_9;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {1,24,4,6,43,36,3,45,79,90};
        int max = arr[0];
        int secondLargest = arr[0];
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : arr) {
            if (j > secondLargest && j < max) {
                secondLargest = j;
            }
        }
        System.out.println(secondLargest);

    }
}
