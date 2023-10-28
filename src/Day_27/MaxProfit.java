package Day_27;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class MaxProfit {
    public static void main(String[] args) {
        int [] prices = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int [] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            currentProfit = price - minPrice;
            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
