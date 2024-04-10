public class T02_07_GetIntersectionNode{

        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA,lenB;
            lenA = 0;
            lenB = 0;
            ListNode curA = headA;
            ListNode curB = headB;
            while (curA.next!=null){
               lenA++;
               curA = curA.next;
            }
            while (curB.next!=null){
                lenB++;
                curB = curB.next;
            }
            lenA++;
            lenB++;
            if (lenA>=lenB){
                int sub = lenA-lenB;
                curA = headA;
                for (int i=0;i<sub;i++) {
                    curA = curA.next;
                }
                headA = curA;
                while (curA.next!=null){
                    if (curA.value != headB.value){
                        return null;
                    }
                    curA = curA.next;
                    headB = headB.next;
                }
            }else {
                int sub = lenB-lenA;
                curB = headB;
                for (int i=0;i<sub;i++) {
                    curB = curB.next;
                }
                curA = headA;
                while (curA.next!=null){
                    if (curA.value != curB.value){
                        return null;
                    }
                    curA = curA.next;
                    curB = curB.next;
                }
            }
            return headA;
        }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1 = getIntersectionNode(node1,node3);
    }
}
