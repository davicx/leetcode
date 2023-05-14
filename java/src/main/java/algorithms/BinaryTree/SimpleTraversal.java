package algorithms.BinaryTree;

import java.util.ArrayList;

public class SimpleTraversal {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("1");
        TreeNode leftNode = new TreeNode("2");
        TreeNode rightNode = new TreeNode("3");

        myTree.left = leftNode;
        myTree.right = rightNode;

        ArrayList<String> answer = inOrder(myTree, list);
        System.out.println(answer);

    }

    private static ArrayList<String> inOrder(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            //System.out.println("Root is null");
            return list;
        } else {
            System.out.println("Current Val: " + root.val);
            System.out.println("called Left: " + root.left + " Right: " + root.right);
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);


        return list;
    }
}



