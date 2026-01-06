// using JCF 
import java.util.*;
public class DoubleendedQ{

    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addFirst(5);
        dq.addLast(6);
        dq.addLast(7);
        dq.addLast(8);
        dq.addLast(9);
        dq.addLast(10);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println(dq);
    }
}