package Day_43;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-tower-breakers-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two
public class TowerBreaker {
    public static void main(String[] args) {
        int n = 2;
        int m = 6;
    }

    //From the observation it is noted that if there are odd number of towers player 1 always wins

    public static int winner(int n, int m){
        if(m==1 || n%2==0){
            return 2;
        }
        else {
            return 1;
        }
    }
}
