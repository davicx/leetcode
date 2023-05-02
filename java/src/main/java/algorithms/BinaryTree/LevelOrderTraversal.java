package algorithms.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

        //In Order
        ArrayList<String> answer = inOrder(myTree, list);
        System.out.println(answer);

        //Level Order
        ArrayList<ArrayList<String>> levelAnswer = levelOrder(myTree);
        System.out.println(levelAnswer);


    }

    //In Order Traversal
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

    //In Order Traversal
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


