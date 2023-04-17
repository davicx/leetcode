package algorithms.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

//O(n) space and time

public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode myTree = new TreeNode("1");
        TreeNode rightNode = new TreeNode("2");
        TreeNode rightLeftNode = new TreeNode("3");

        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;


        inOrder(myTree);
    }


    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println("Current Value " + root.val);
        inOrder(root.right);
    }



    public static ArrayList<String> iterative(ArrayList<String> root) {
        ArrayList<String> answer = new ArrayList<String>();

        return answer;

    }

    //public static ArrayList<String> inOrderSearch(ArrayList<String> root) {
    public static ArrayList<String> inOrderSearch(TreeNode root) {
        ArrayList<String> answer = new ArrayList<String>();
        return answer;

    }

}



