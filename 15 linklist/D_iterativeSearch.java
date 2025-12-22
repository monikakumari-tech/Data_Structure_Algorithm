public class D_iterativeSearch {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        if (head == null) {

            head = tail = newNode;
            return;
        }
        // newNode next= head
        newNode.next = head;
        // head= newNode
        head = newNode;
    }

    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head = tail;
            return;
        }
        // tail's next point to newnode
        tail.next = newNode;
        // update tail to newnode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean iterativeSearch(int key) { // O(n)
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        D_iterativeSearch ll = new D_iterativeSearch();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(7);
        ll.addFirst(9);

        ll.print();
        System.out.println(ll.iterativeSearch(5));
        System.out.println(ll.iterativeSearch(11));
    }
}
