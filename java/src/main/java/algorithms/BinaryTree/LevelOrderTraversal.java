package algorithms.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Complexity O(n)
public class LevelOrderTraversal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("3");
        TreeNode leftNode = new TreeNode("9");
        TreeNode rightNode = new TreeNode("20");
        TreeNode rightLeftNode = new TreeNode("15");
        TreeNode rightRightNode = new TreeNode("7");

        myTree.right = rightNode;
        myTree.left = leftNode;

        myTree.right.right = rightRightNode;
        myTree.right.left = rightLeftNode;


        //Level Order
        ArrayList<ArrayList<String>> levelAnswer = levelOrder(myTree);
        System.out.println(levelAnswer);


    }

    //Level Order Traversal
    public static ArrayList<ArrayList<String>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            System.out.println("Queue Size: " + queue.size());
            Integer size = queue.size();
            ArrayList <String> currentLevel = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }


}


