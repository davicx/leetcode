package algorithms.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        TreeNodeInt myTree = new TreeNodeInt(1);
        TreeNodeInt rightNode = new TreeNodeInt(2);
        TreeNodeInt leftNode = new TreeNodeInt(2);

        TreeNodeInt leftLeftNode = new TreeNodeInt(3);
        TreeNodeInt leftRightNode = new TreeNodeInt(4);
        TreeNodeInt rightLefttNode = new TreeNodeInt(4);
        TreeNodeInt rightRightNode = new TreeNodeInt(3);

        myTree.left = leftNode;
        myTree.right = rightNode;
        myTree.left.left = leftLeftNode;
        myTree.left.right = leftRightNode;
        myTree.right.left = rightLefttNode;
        myTree.right.right = rightRightNode;
        Boolean answer = isSymmetric(myTree);
        System.out.println("answer");
        System.out.println(answer);

    }

    public static boolean isSymmetric(TreeNodeInt myTree) {
        ArrayList<ArrayList<Integer>> levelAnswer = levelOrder(myTree);
        System.out.println(levelAnswer);

        for (int i = 0; i < levelAnswer.size(); i++) {
            Boolean levelSymmetric = compareList(levelAnswer.get(i));
            if(levelSymmetric == false) {
                return false;
            }
        }

        return true;
    }

    public static boolean compareList(ArrayList<Integer> treeLevel) {
        //ArrayList<Integer> treeLevel = new ArrayList<Integer>();
        if(treeLevel.size() == 1) {
            return true;
        }

        //Check for Odd
        if((treeLevel.size() % 2) != 0) {
            return false;
        }

        Integer leftPointer = 0;
        Integer rightPointer = treeLevel.size() - 1;

        for(int i = 0; i < treeLevel.size(); i++) {
            System.out.println(treeLevel.get(leftPointer) + " " + treeLevel.get(rightPointer));
            if(treeLevel.get(leftPointer) != treeLevel.get(rightPointer)) {
                return false;
            }

            leftPointer = leftPointer + 1;
            rightPointer = rightPointer - 1;
            if(leftPointer >= rightPointer) {
                System.out.println("Reached middle");
                break;
            }
        }

        return true;
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNodeInt root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNodeInt> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            System.out.println("Queue Size: " + queue.size());
            Integer size = queue.size();
            ArrayList <Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNodeInt current = queue.remove();
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


/*

    public static boolean compareList(ArrayList<Integer> treeLevel) {
        //ArrayList<Integer> treeLevel = new ArrayList<Integer>();
        if(treeLevel.size() == 1) {
            return true;
        }
        //Check for Odd
        if((treeLevel.size() % 2) != 0) {
            return false;
        }
        //Level 1
        //treeLevel.add("1");

        //Level 2
        //treeLevel.add("2");
        //treeLevel.add("2");

        //Level 3
        //treeLevel.add(3);
        //treeLevel.add(4);
        //treeLevel.add(4);
        //treeLevel.add(3);

        Integer leftPointer = 0;
        Integer rightPointer = treeLevel.size() - 1;

        for(int i = 0; i < treeLevel.size(); i++) {
            System.out.println(treeLevel.get(leftPointer) + " " + treeLevel.get(rightPointer));
            if(treeLevel.get(leftPointer) != treeLevel.get(rightPointer)) {
                return false;
            }

            leftPointer = leftPointer + 1;
            rightPointer = rightPointer - 1;
            if(leftPointer >= rightPointer) {
                System.out.println("Reached middle");
                break;
            }
        }

        return true;
    }
 */