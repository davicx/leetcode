package algorithms.LinkedList;

import algorithms.Node.ListNode;

public class myLinkedList {
    public static void main(String[] args) {
        ListNode third = new ListNode("Hi Third!");
        ListNode second = new ListNode("Hi Second!", third);
        ListNode first = new ListNode("Hi first!", second);
        System.out.println(first.val);
        System.out.println(first.next.val);
        System.out.println(second.val);
        System.out.println(third.val);
    }
}
