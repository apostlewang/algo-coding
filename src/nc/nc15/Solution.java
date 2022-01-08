package nc.nc15;

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
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // 使用LinkedList创建一个队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return result;
        }else {
            queue.add(root);
            while (!queue.isEmpty()){
                // 记录当前层的节点个数
                int len = queue.size();
                ArrayList<Integer> level = new ArrayList<>();
                while (len > 0){
                    TreeNode poped = queue.pop();
                    if(poped.left != null){
                        queue.add(poped.left);
                    }
                    if(poped.right != null){
                        queue.add(poped.right);
                    }
                    len--;
                    level.add(poped.val);
                }
                result.add(level);
            }

        }
        return result;

    }
}
