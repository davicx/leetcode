package algorithms.Node;

public class SimpleNode {
    public static void main(String[] args) {
        ListNode second = new ListNode("Hi Second!");
        ListNode first = new ListNode("Hi first!", second);
        System.out.println(first.val);
        System.out.println(first.next.val);
    }
}

class ListNode {
    String val;
    ListNode next;
    ListNode() {

    }
    ListNode(String val) {
        this.val = val;
    }
    ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
