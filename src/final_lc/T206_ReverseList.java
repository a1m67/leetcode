package final_lc;

public class T206_ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        if (current.next == null) {
            current.next = prev;
            head.next = null;
            return current;
        }
        while (current != null ) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head.next = null;
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        System.out.println(reverseList(node));
    }
}