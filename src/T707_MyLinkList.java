public class T707_MyLinkList {
    ListNode headNode;
    int size;


    public int get(int index) {
        if (index < 0 || index >=size)return -1;
        ListNode dummyNode = new ListNode();
        dummyNode.next = headNode;
        ListNode cur = headNode;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
        }
        int i = cur == null ? -1 : cur.value;
        return i;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index >= size){
            return;
        }
        size++;
        ListNode dummyNode = new ListNode();
        dummyNode.next = headNode;
        ListNode cur = headNode;
        ListNode prev = dummyNode;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
            prev = prev.next;
        }
        ListNode node = new ListNode(val);
        node.next = cur;
        prev.next = node;
        headNode = prev;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        size--;
        ListNode dummyNode = new ListNode();
        dummyNode.next = headNode;
        ListNode cur = headNode;
        ListNode prev = dummyNode;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
            prev = prev.next;
        }
        prev.next = cur.next;
    }

    public static void main(String[] args) {
        T707_MyLinkList myLinkList = new T707_MyLinkList();
        myLinkList.headNode = new ListNode(0);
        myLinkList.size++;
        ListNode node1 = new ListNode(1);
        myLinkList.headNode.next = node1;
        myLinkList.size++;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        myLinkList.size++;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        myLinkList.size++;
        myLinkList.addAtHead(5);
        System.out.println(myLinkList.get(0));
    }
}
