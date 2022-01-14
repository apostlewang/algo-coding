package leetcode.lc283;

import java.util.ArrayList;

public class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> noneZeros = new ArrayList<>();
        for (int num: nums) {
            if(num != 0){
                noneZeros.add(num);
            }
        }
        for (int i = 0; i < noneZeros.size(); i++) {
            nums[i] = noneZeros.get(i);
        }
        for (int i = noneZeros.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
