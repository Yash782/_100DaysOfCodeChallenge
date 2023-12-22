package Day_75;
//https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
public class EqualRowAndColPairs {
    public static void main(String[] args) {
        int [] [] arr = {{3,2,1}, {1,7,6}, {2,7,7}};
        System.out.println(equalPairs(arr));
    }
    public static int equalPairs(int[][] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                int flag=0;

                for(int k=0;k<n;k++){
                    if(arr[i][k]!=arr[k][j]){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    count++;

                }
            }
        }
        return count;
    }
}
