package algorithms.BinaryTree;

import java.util.ArrayList;

public class SumOfLeftLeaves {
    //root = [3,9,20,null,null,15,7]
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        TreeNode myTree = new TreeNode("3");
        TreeNode leftNode = new TreeNode("9");
        TreeNode rightNode = new TreeNode("20");
        TreeNode rightLeftNode = new TreeNode("15");
        TreeNode rightRighttNode = new TreeNode("7");

        myTree.left = leftNode;
        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;
        myTree.right.right = rightRighttNode;

        ArrayList<String> answer = inOrder(myTree, list);
        System.out.println(answer);

    }

    private static ArrayList<String> inOrder(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            return list;
        } else {
            System.out.println("called Left: " + root.left + " Right: " + root.right);
        }

        inOrder(root.left, list);
        System.out.println("Current Value " + root.val);
        list.add(root.val);

        inOrder(root.right, list);

        return list;
    }
}
