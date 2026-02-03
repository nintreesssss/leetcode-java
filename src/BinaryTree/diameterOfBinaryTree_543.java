//LeetCode 543:二叉树的直径
//https://leetcode.cn/problems/diameter-of-binary-tree/description/

package BinaryTree;

public class diameterOfBinaryTree_543 {
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
    
    int Maxdiameter = 0;

    public int sol(TreeNode root){
        traverse(root);
        return Maxdiameter;
    }

    public void traverse(TreeNode root){
        if (root == null) {
            return;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int Mydiameter = leftMax + rightMax;
        Maxdiameter = Math.max(Mydiameter, Maxdiameter);

        traverse(root.left);
        traverse(root.right);
    }

    int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }
}


/*class Solution {
    // 记录最大直径的长度
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        // 后序位置，顺便计算最大直径
        int myDiameter = leftMax + rightMax;
        maxDiameter = Math.max(maxDiameter, myDiameter);

        return 1 + Math.max(leftMax, rightMax);
    }
} */

//后序遍历 时间复杂度O(N)