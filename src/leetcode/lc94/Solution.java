package leetcode.lc94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return result;
    }
    void dfs(TreeNode root){
        if (root != null){
            dfs(root.left);
            result.add(root.val);
            dfs(root.right);
        }
    }
}
