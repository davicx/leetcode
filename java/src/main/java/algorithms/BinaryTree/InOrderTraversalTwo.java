package algorithms.BinaryTree;

import java.util.ArrayList;

//O(n) space and time

//Start going left and print on second visit
public class InOrderTraversalTwo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("1");
        TreeNode rightNode = new TreeNode("2");
        TreeNode rightLeftNode = new TreeNode("3");

        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;

        ArrayList<String> answer = inOrder(myTree, list);
        System.out.println(answer);

    }

    private static ArrayList<String> inOrder(TreeNode root, ArrayList<String> list) {
        System.out.println("called");
        if (root == null) {
            return list;
        }

        inOrder(root.left, list);
        System.out.println("Current Value " + root.val);
        list.add(root.val);

        inOrder(root.right, list);

        return list;
    }



}



