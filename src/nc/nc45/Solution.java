package nc.nc45;
//
import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    ArrayList<Integer> pre = new ArrayList<>();
    ArrayList<Integer> mid = new ArrayList<>();
    ArrayList<Integer> after = new ArrayList<>();
    public int[][] threeOrders (TreeNode root) {
        // write code here
        dfs(root);
        int[][] result_array = new int[3][pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            result_array[0][i] = pre.get(i);
            result_array[1][i] = mid.get(i);
            result_array[2][i] = after.get(i);
        }
        return result_array;
    }
    void dfs(TreeNode root){
        if (root == null){
            return;
        }
        // 前序遍历 root left right
        pre.add(root.val);
        dfs(root.left);
        // 中序遍历 left root right
        mid.add(root.val);
        dfs(root.right);
        // 后序遍历 left right root
        after.add(root.val);
    }

}