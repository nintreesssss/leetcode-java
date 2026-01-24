//LeetCode 111:二叉树的最小深度
//https://leetcode.cn/problems/minimum-depth-of-binary-tree/description/

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class minDepth_111 {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }

    public int Solution(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 1;
        if (root == null) {
            return 0;
        }
        q.offer(root);

        while (q != null) {
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                if (cur.left !=  null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
            }
            depth++;
        }
        return depth;
    }
}
