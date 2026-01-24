//LeetCode 94:二叉树的中序遍历
//https://leetcode.cn/problems/binary-tree-inorder-traversal/

package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
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
        list.addLast(root.val);
        traverse(root.right);
    }

    public List<Integer> Solution(TreeNode root){
        traverse(root);
        return list;
    }
}
