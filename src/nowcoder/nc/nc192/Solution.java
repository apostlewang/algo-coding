package nowcoder.nc.nc192;

import java.util.*;

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
    ArrayList<Integer> post = new ArrayList<>();
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        dfs(root);
        int[] result = new int[post.size()];
        for (int i = 0; i < post.size(); i++) {
            result[i] = post.get(i);
        }
        return result;
    }
    void dfs(TreeNode root){
        if (root != null){
            dfs(root.left);
            dfs(root.right);
            post.add(root.val);
        }
    }
}
