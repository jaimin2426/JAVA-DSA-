import java.util.LinkedList;

public class jcfll{
    public static void main(String args[]){
        // create
        LinkedList<Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        System.out.println(ll);
        ll.addLast(2);
        System.out.println(ll);
        ll.addFirst(0);
        System.out.println(ll);
        ll.addFirst(-1);
        System.out.println(ll);
        ll.addFirst(-2);
        System.out.println(ll);
        // remove

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}