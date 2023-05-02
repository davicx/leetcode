package algorithms.BinaryTree;

import java.util.ArrayList;

public class PreOrderTraversal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("1");
        TreeNode rightNode = new TreeNode("2");
        TreeNode rightLeftNode = new TreeNode("3");

        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;

        ArrayList<String> answer = preOrder(myTree, list);
        System.out.println(answer);
    }

    private static ArrayList<String> preOrder(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);

        preOrder(root.left, list);
        preOrder(root.right, list);

        return list;
    }
}
