package maximumDepthOfBinaryTree;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Answer {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        // treeNode.right = new TreeNode(20);
        // treeNode.right.left = new TreeNode(15);
        // treeNode.right.right = new TreeNode(7);
        Solution solution = new Solution();
        int i = solution.maxDepth(treeNode);
        System.out.println(i);
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



