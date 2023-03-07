package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        List<Integer> list = solution.inorderTraversal(treeNode);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // 定义返回的内容
        List<Integer> res = new ArrayList<Integer>();
        order(root,res);
        return res;
    }
    void order(TreeNode root,List<Integer> list){
        // 终止条件
        if (root == null){
            return;
        }
        // 左
        order(root.left,list);
        // 中
        list.add(root.val);
        // 右
        order(root.right,list);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
