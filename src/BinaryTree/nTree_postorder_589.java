//LeetCode 590
//https://leetcode.cn/problems/n-ary-tree-postorder-traversal/

package BinaryTree;

import java.util.List;
import java.util.ArrayList;

public class nTree_postorder_589 {
    List<Integer> list = new ArrayList<>();
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    }

    public void traverse(Node root){
        if(root == null){
            return;
        }
        for(Node cd : root.children){
            traverse(cd);
        }
        list.add(root.val);
    }

    public List<Integer> preorder(Node root){
        traverse(root);
        return list;
    }
}
