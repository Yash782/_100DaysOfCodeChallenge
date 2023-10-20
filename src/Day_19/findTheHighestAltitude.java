package Day_19;
//https://leetcode.com/problems/find-the-highest-altitude/submissions/?envType=study-plan-v2&envId=leetcode-75

//Beats 100.00%of users with Java(20/10/23)
public class findTheHighestAltitude {
    public static void main(String[] args) {
        int [] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for(int i : gain){
            altitude = altitude+i;
            if(altitude>max){
                max = altitude;
            }
        }
        return max;
    }

}
