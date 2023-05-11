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

        Integer answer = rangeSumBST(myTree, 7,15);
        System.out.println(answer);

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
            if(current.val >= L && current.val <= R) {
                sum += current.val;
            }
            if(current.left != null && current.val > L) {
                queue.add(current.left);
            }
            if(current.right != null && current.val < R) {
                queue.add(current.right);
            }
        }

        return sum;

    }
}
