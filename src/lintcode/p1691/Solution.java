package lintcode.p1691;

import java.util.PriorityQueue;

public class Solution {
    /**
     * @param a: the array a
     * @return: return the maximum profit
     */
    public int getAns(int[] a) {
        // write your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int res = 0;
        for (int k: a) {
            if(!minHeap.isEmpty() && minHeap.peek()<k){
                // 最低的那一天卖掉，当天这一天买入
                res +=k-minHeap.poll();
                minHeap.offer(k);
                //System.out.println(k);
            }
            // 相当于当前这一天有一个卖出的机会，等价于撤销之前的买入操作
            minHeap.offer(k);
            //System.out.println(k);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getAns(new int[]{1,2,10,9}));
        System.out.println(new Solution().getAns(new int[]{2,1,2,0,1}));
        System.out.println(new Solution().getAns(new int[]{4,3,2,1}));
        System.out.println(new Solution().getAns(new int[]{1,2,4,7}));
    }
}
