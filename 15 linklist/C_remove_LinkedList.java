public class C_remove_LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
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
        size++;

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

    public void add(int idx, int data) {
        // create new node
        Node newNode = new Node(data);
        size++;

        // if idx =0
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        size--;
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public static void main(String[] args) {
        C_remove_LinkedList ll = new C_remove_LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(7);

        ll.print();
        ll.add(2, 4);
        ll.print();
        System.out.println("Size of linked list: " + size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Size of linked list: " + size);
    }
}
