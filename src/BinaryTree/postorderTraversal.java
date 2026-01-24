//LeetCode 145:二叉树的后序遍历
//https://leetcode.cn/problems/binary-tree-postorder-traversal/

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {
    List<Integer> list = new ArrayList<>();
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

    public void traverse(TreeNode root){
        if (root == null) {
            return;
        }
        traverse(root.left);
        traverse(root.right);
        list.addLast(root.val);
    }

    public List<Integer> Solution(TreeNode root){
        traverse(root);
        return list;
    }
}
