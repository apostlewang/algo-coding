package lintcode.p149;

public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices.length==0){
            return 0;
        }
        int minPrice = prices[0];
        int currentProfit = 0;
        for (int k: prices) {
            if (k > minPrice){
                if(k-minPrice>currentProfit){
                    currentProfit = k-minPrice;
                }
            }else{
                minPrice = k;
            }
        }
        return currentProfit;
    }
}
