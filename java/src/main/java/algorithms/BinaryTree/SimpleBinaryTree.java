package algorithms.BinaryTree;

public class SimpleBinaryTree {
    public static void main(String[] args) {
        TreeNode myTree = new TreeNode("1");
        TreeNode leftNode = new TreeNode("2");
        TreeNode rightNode = new TreeNode("3");

        myTree.left = leftNode;
        myTree.right = rightNode;

        String a = null;

        if(a == null) {
            System.out.println("null");
        }


        if(myTree.left.right == null) {
            System.out.println("none!");
        } else {
            System.out.println(myTree.left.right.val);
        }

    }
}