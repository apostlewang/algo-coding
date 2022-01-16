package nowcoder.nc.nc231;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    TreeMap<Integer, Integer> map = new TreeMap<>();
    public int singleNumber (int[] nums) {
        // write code here
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry:
             map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{2,3,2,1,1}));
    }
}
