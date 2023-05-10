package algorithms.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Stop at 5
public class LearnRangeSumBST {
    public static void main(String[] args) {

        TreeNodeInt myTree = new TreeNodeInt(10);
        TreeNodeInt rightNode = new TreeNodeInt(5);
        TreeNodeInt leftNode = new TreeNodeInt(15);

        TreeNodeInt leftLeftNode = new TreeNodeInt(3);
        TreeNodeInt leftRightNode = new TreeNodeInt(7);
        TreeNodeInt rightRightNode = new TreeNodeInt(18);


        myTree.left = leftNode;
        myTree.right = rightNode;
        myTree.left.left = leftLeftNode;
        myTree.left.right = leftRightNode;
        myTree.right.right = rightRightNode;

        /*
        ArrayList<String> answer = findSumBST(myTree, list);
        System.out.println(answer);
        Integer answerSum = 0;

        for (String i : answer){
            Integer currentValue = Integer.parseInt(i);
            answerSum = answerSum + currentValue;
        }
        System.out.println(answerSum);
        */
    }

    private static Integer rangeSumBST(TreeNodeInt root, Integer L, Integer R) {
        Integer sum = 0;
        if (root == null) {
            return 0;
        }

        Queue<TreeNodeInt> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNodeInt current = queue.remove();
            System.out.println("Queue Size: " + queue.size());

        }


        /*
        while (!queue.isEmpty()) {

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
         */


        return 0;


    }




}
