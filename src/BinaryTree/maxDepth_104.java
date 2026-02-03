//LeetCode 104:二叉树的最大深度
//https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/

package BinaryTree;

public class maxDepth_104 {
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

    int depth = 0;
    int res;

    public int sol(TreeNode root){
        traverse(root);
        return res;
    }

    public void traverse(TreeNode root){
        if (root == null) {
            return;
        }

        depth++;
        if (root.left == null && root.right == null) {
            res = Math.max(res, depth);
        }

        traverse(root.left);
        traverse(root.right);

        depth--;
    }
}
