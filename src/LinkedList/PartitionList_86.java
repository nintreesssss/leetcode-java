//LeetCode 86:分隔链表
//https://leetcode.cn/problems/partition-list/

package LinkedList;


class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode();
        ListNode dummy2 = new ListNode();
        ListNode p = head;
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(p != null){
            if(p.val < x){
                p1.next = p;
                p1 = p1.next;

            }else{
                p2.next = p;
                p2 = p2.next;

            }

            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }

        p1.next = dummy2.next; //注意第二条链表的头结点是dummy2.next
        return dummy1.next;
    }
}