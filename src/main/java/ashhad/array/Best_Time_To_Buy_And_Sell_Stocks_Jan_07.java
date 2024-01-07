package src.main.java.ashhad.array;

public class Best_Time_To_Buy_And_Sell_Stocks_Jan_07 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    private static int maxProfit(int[] prices) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minVal = Math.min(minVal,prices[i]);
            maxVal = Math.max(maxVal,prices[i]-minVal);
        }
        return maxVal;
    }
}
