package final_lc;

public class T142_DetectCycle {
    public static ListNode detectCycle(ListNode head) {
//        ListNode fast,slow,index1;
//        fast = head;
//        slow = head;
//        index1 = null;
//        while (fast!=null && fast.next.next!=null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (fast == slow) {
//                index1 = fast;
//                break;
//            }
//        }
//        if (index1 == null) {
//            System.out.println(-1);
//            return null;
//        }
//        if (index1 == head) {
////            System.out.println(0);
//            return head;
//        }
//        int count = 0;
//        while (true) {
//            count ++;
//            index1 = index1.next;
//            head = head.next;
//            if (index1 == head) {
////                System.out.println(count);
//                return index1;
//            }
//        }

        if (head == null) {
            return null;
        }
        ListNode fast,slow,index1,index2;
        fast = head;
        slow = head;
        index2 = head;
        index1 = null;
        while (fast!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
        
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(0);
//        ListNode node4 = new ListNode(-4);
//        ListNode node5 = new ListNode(5);
        node.next = node2;
//        node2.next = node;
//        node3.next = node4;
//        node4.next = node2;
    }
}