
public class I_detectLoop {
    // Floyd’s Cycle-Finding Algorithm

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

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2

            if (slow == fast) { // loop detected
                return true;
            }
        }
        return false; // no loop
    }

    public static void main(String[] args) {
        I_detectLoop ll = new I_detectLoop();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(7);

        ll.print();

        ll.tail.next = ll.head.next; // loop starting from second node

        ll.print();

        System.out.println(ll.detectLoop()); // false

    }
}