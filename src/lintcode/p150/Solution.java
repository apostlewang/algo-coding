package lintcode.p150;

import java.util.PriorityQueue;

public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int res = 0;
        for (int k: prices) {
            if(min<k){
                res +=k-min;
            }
            min = k;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{3,2,6,5,0,3}));
    }


}
