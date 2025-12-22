// Add first in LL
public class A_LinkedList {

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

    public static void main(String[] args) {
        A_LinkedList ll = new A_LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(7);

        ll.print();
    }
}