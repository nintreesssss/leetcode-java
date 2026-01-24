//LeetCode 144:二叉树的前序遍历
//https://leetcode.cn/problems/binary-tree-preorder-traversal/

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {
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
        list.addLast(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    public List<Integer> Solution(TreeNode root){
        traverse(root);
        return list;
    }
}
