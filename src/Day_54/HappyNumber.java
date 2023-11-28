package Day_54;
//https://leetcode.com/problems/happy-number/description/
public class HappyNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);
        if(slow == 1){
            return true;
        }


        return false;
    }
    public static int findSquare(int num){
        int ans = 0;
        while(num >0){
            int rem = num%10;
            ans += rem * rem;
            num /= 10;
        }

        return ans;
    }
}
