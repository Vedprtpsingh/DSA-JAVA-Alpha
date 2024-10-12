import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        System.out.println(ll);
    }
}
