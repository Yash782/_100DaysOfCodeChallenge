package Day_13;

public class CountOddEven {
    public static void main(String[] args) {
        int [] arr = {1, 20, 60, 31, 75, 40, 80};
        int evenCount = 0;
        int oddCount = 0;
        for(int i : arr){
            if(i % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even number count: "+ evenCount);
        System.out.println("Odd number count: "+ oddCount);
    }
}
