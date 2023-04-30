package algorithms.Node;

public class ListNode {
    public String val;
    public ListNode next;

    public ListNode(String val) {
        this.val = val;
    }

    public ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}