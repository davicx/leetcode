package algorithms.BinaryTree;


import java.util.ArrayList;

public class RootEqualsSumOfChildren {

    public static void main(String[] args) {

        TreeNode myTree = new TreeNode("10");
        TreeNode leftNode = new TreeNode("4");
        TreeNode rightNode = new TreeNode("6");

        myTree.left = leftNode;
        myTree.right = rightNode;

        Boolean answer = checkTree(myTree);
        System.out.println(answer);

    }

    private static boolean checkTree(TreeNode root) {
        return root.val == root.right.val + root.left.val;
    }
}



    /*

    class Solution {
    public boolean checkTree(TreeNode root) {
        System.out.println(root.val + " " + root.right.val + " " + root.left.val);
        return root.val == root.right.val + root.left.val;
    }

     */

