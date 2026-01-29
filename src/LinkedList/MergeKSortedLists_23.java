//LeetCode 23:合并K个升序链表
//https://leetcode.cn/problems/merge-k-sorted-lists/

package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedLists_23 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeKLists(ListNode[] lists){
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> (a.val - b.val));
        ListNode dummy = new ListNode();
        ListNode p = dummy;

        for(ListNode head : lists){
            if (head != null) {
                pq.add(head);
            }
        }

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}
