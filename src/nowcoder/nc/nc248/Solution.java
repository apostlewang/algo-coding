package nowcoder.nc.nc248;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型
     */
    int sum = 0;
    public int sumOfLeftLeaves (TreeNode root) {
        // write code here
        dfs(root, false);
        return sum;
    }
    void dfs(TreeNode root, Boolean isLeft){
        if(root != null){
            dfs(root.left, true);
            dfs(root.right, false);
            if(root.left == null && root.right == null && isLeft){
                sum += root.val;
            }
        }
    }
}
