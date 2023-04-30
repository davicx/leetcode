package algorithms.LinkedList.leetcode;

import algorithms.Node.ListNode;

import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode third = new ListNode("Hi Third!", null);
        ListNode second = new ListNode("Hi Second!", third);
        ListNode head = new ListNode("Hi first!", second);


        removeElements(head, 2);

    }

    //Method
    static void removeElements(ListNode head, int val) {
        //ListNode currentNode = head;

        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}

