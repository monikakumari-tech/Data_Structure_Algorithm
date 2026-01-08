import java.util.LinkedList;

public class K_linkedlist_collection_framework {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addFirst(20);
        list.addLast(30);
        System.out.println(list);
    }
}