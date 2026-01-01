
public class J_removeCycle {
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

    public static void cycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2

            if (slow == fast) { // loop detected
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            System.out.println("No cycle");
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        J_removeCycle ll = new J_removeCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // create cycle
        // false

        // ll.print();
        cycle();
        ll.print();

    }
}