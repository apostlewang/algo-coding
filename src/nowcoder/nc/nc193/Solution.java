package nowcoder.nc.nc193;

import java.util.ArrayList;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    ArrayList<Integer> pre = new ArrayList<>();
    public int[] preorderTraversal (TreeNode root) {
        dfs(root);
        int[] result = new int[pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            result[i] = pre.get(i);
        }
        return result;
    }
    void dfs(TreeNode root){
        if (root != null){
            pre.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
}
