package algorithms.BinaryTree;
import java.util.ArrayList;

public class  returnValue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("1");
        TreeNode rightNode = new TreeNode("2");
        TreeNode rightLeftNode = new TreeNode("3");

        myTree.right = rightNode;
        myTree.right.left = rightLeftNode;

        ArrayList<String> answer = inOrder(myTree, list);
        //System.out.println(answer);

    }

    private static ArrayList<String> inOrder(TreeNode root, ArrayList<String> list) {
        //System.out.println(list);
        if (root == null) {
            return list;
        } else {
            //System.out.println("called Left: " + root.left + " Right: " + root.right);
        }

        inOrder(root.left, list);
        System.out.println("Current Value " + root.val);
        if(root.left != null) {
            System.out.println("Left Child: " + root.left.val);
        } else {
            System.out.println("Left Child: null");
        }

        if(root.right != null) {
            System.out.println("Right Child: " + root.right.val);
        } else {
            System.out.println("Right Child: null");
        }

        System.out.println(" ");
        list.add(root.val);

        inOrder(root.right, list );


        return list;
    }

}



