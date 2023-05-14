package algorithms.BinaryTree;
import java.util.ArrayList;

public class InOrderTraversal {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<String>();

            TreeNode myTree = new TreeNode("1");
            TreeNode leftNode = new TreeNode("2");
            TreeNode rightNode = new TreeNode("3");
            //TreeNode rightLeftNode = new TreeNode("3");

            myTree.right = rightNode;
            myTree.left = rightNode;

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



