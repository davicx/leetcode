package algorithms.BinaryTree;

import java.util.ArrayList;

public class PostOrderTraversal {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("1");
        TreeNode rightNode = new TreeNode("2");
        TreeNode rightLeftNode = new TreeNode("3");

        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;

        ArrayList<String> answer = postOrder(myTree, list);
        System.out.println(answer);
    }

    private static ArrayList<String> postOrder(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            return list;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);

        list.add(root.val);

        return list;
    }
}
