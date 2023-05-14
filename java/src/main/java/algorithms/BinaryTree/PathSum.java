package algorithms.BinaryTree;

import java.util.ArrayList;

public class PathSum {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("4");
        TreeNode leftNode = new TreeNode("2");
        TreeNode rightNode = new TreeNode("7");
        TreeNode leftLeftNode = new TreeNode("1");
        TreeNode leftRightNode = new TreeNode("3");

        //Level 1
        myTree.left = leftNode;
        myTree.right = rightNode;

        //Level 2
        myTree.left.left = leftLeftNode;
        myTree.left.right = leftRightNode;

        //TreeNode answer = hasPathSum(myTree, list);
        //System.out.println(answer.val + " " + answer.left.val + " " + answer.right.val);

    }

    private static boolean hasPathSum(TreeNode root, ArrayList<String> list) {
        Integer sum = 7;
        int rootVal = Integer.parseInt(root.val);

        if (root == null) {
            return false;
        }




        return true;


    }
}