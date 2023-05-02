package algorithms.BinaryTree;

import java.util.ArrayList;

public class SameTreeTwo {
    public static void main(String[] args) {
        TreeNode p = new TreeNode("1");
        TreeNode leftNode = new TreeNode("2");
        TreeNode rightNode = new TreeNode("3");

        p.left = leftNode;
        p.right = null;

        TreeNode q = new TreeNode("1");
        TreeNode qLeftNode = new TreeNode("2");
        TreeNode qRightNode = new TreeNode("3");

        q.left = null;
        q.right = qRightNode;

        System.out.println(isSameTree(p, q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        } else if (p == null || q == null){
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    private static ArrayList<String> inOrder(TreeNode root, ArrayList<String> list) {
        if (root == null) {
            return list;
        }

        inOrder(root.left, list);

        if(root.val == null) {
            System.out.println("null " + root.val);
        } else {
            System.out.println("ok " + root.val);
        }
        list.add(root.val);
        inOrder(root.right, list);

        return list;
    }


}


