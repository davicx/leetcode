package algorithms.BinaryTree;

import algorithms.BinaryTree.TreeNode;

import java.util.ArrayList;


public class RangeSumOfBST {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        TreeNode myTree = new TreeNode("10");
        TreeNode rightNode = new TreeNode("5");
        TreeNode leftNode = new TreeNode("15");

        TreeNode leftLeftNode = new TreeNode("3");
        TreeNode leftRightNode = new TreeNode("7");
        TreeNode rightRightNode = new TreeNode("18");

        myTree.left = leftNode;
        myTree.right = rightNode;
        myTree.left.left = leftLeftNode;
        myTree.left.right = leftRightNode;
        myTree.right.right = rightRightNode;

        ArrayList<String> answer = findSumBST(myTree, list);
        System.out.println(answer);
        Integer answerSum = 0;

        for (String i : answer){
            Integer currentValue = Integer.parseInt(i);
            answerSum = answerSum + currentValue;
        }
        System.out.println(answerSum);

    }

    //public int rangeSumBST(TreeNode root, int low, int high)
    private static ArrayList<String> findSumBST(TreeNode root, ArrayList<String> list) {
        Integer low  = 7;
        Integer high = 15;
        Integer currentValue;

        if (root == null) {
            return list;
        } else {
            currentValue = Integer.parseInt(root.val);
        }

        findSumBST(root.left, list);
        System.out.println("Current Value " + currentValue);
        if(currentValue >= low && currentValue <= high) {
            list.add(root.val);
            //System.out.println(currentValue);
        }

        findSumBST(root.right, list);

        return list;
    }
}