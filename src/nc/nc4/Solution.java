package nc.nc4;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        HashSet<ListNode> visited = new HashSet<>();
        while (cur != null){
            if (visited.contains(cur)){
                return true;
            }
            visited.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
