package Day_13;


public class NonRepeatingElements {
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 30, 40, 40, 40, 50};
        System.out.println("Repeating elements are");
        for(int n : arr){
            if(repeatCheck(arr, n)){
                System.out.println(n);
            }
        }
    }

    static boolean repeatCheck(int [] arr, int n ){
        int count = 0;
        for(int i : arr){
            if(i == n){
                count++;
            }
        }
        return count == 1;
    }
}
