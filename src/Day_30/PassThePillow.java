package Day_30;

public class PassThePillow {
    public static void main(String[] args) {
        int n = 3;
        int time = 2;
        System.out.println(passThePillow(n,time));
    }
    public static int passThePillow(int n, int time) {
        int curr=1;
        int currTime=0;
        while (currTime<time) {
            while (curr<n && currTime<time) {
                curr+=1;
                currTime++;
            }
            while (curr>1 && currTime<time) {
                curr-=1;
                currTime++;
            }

        }
        return curr;
    }
}
