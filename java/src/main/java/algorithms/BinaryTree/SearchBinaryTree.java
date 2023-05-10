package algorithms.BinaryTree;

import java.util.ArrayList;

public class SearchBinaryTree {
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

        TreeNode answer = searchBST(myTree, list);
        System.out.println(answer.val + " " + answer.left.val + " " + answer.right.val);

    }

    private static TreeNode searchBST(TreeNode root, ArrayList<String> list) {
        Integer val = 2;
        int rootVal = Integer.parseInt(root.val);

        if (root == null) {
            return null;
        }
        if (rootVal == val) {
            return root;
        }
        if (val < rootVal) {
            return searchBST(root.left, list);
        } else {
            return searchBST(root.right, list);
        }


    }

}
