package final_lc;

public class T203_RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null ) {
            return null;
        }
        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode current = head;
        ListNode prev = virtualNode;

        while (current != null) {
            if (current.val == val) {
                current = current.next;
                prev.next = current;
                continue;
            }
            current = current.next;
            prev = prev.next;
        }
        if (virtualNode.next == null) {
            return null;
        }
        return virtualNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        System.out.println(removeElements(head,1));
    }
}