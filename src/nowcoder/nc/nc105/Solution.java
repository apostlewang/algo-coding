package nowcoder.nc.nc105;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 如果目标值存在返回下标，否则返回 -1
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search (int[] nums, int target) {
        // write code here
        // 搜素区间为[l,r]
        int l,r;
        l = 0;
        r = nums.length-1;
        while (r >= l){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                int result = mid;
                while (true){
                    result--;
                    if(result<0 ||nums[result] != target){
                        result++;
                        break;
                    }
                }
                return result;
            }else if(nums[mid] > target){
                // [l, mid-1]
                r = mid-1;
            }else {
                // [mid+1, r]
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,4,5,5,7,8};
        System.out.println(new Solution().search(nums, 5));
        nums = new int[]{-2,1,2};
        System.out.println(new Solution().search(nums, -2));
    }

}
