import java.util.*;

public class LHS{
    public static void main(String args[]){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // add elements O(1)
        lhs.add(5);
        lhs.add(20);
        lhs.add(1);
        lhs.add(3);
        lhs.add(7);
        lhs.add(9);
        lhs.add(8);
        lhs.add(10);
        lhs.add(3); // duplicate ignored
        System.out.println(lhs);

        // contains O(1)
        System.out.println(lhs.contains(3));
        System.out.println(lhs.contains(7));

        // remove O(1)
        lhs.remove(1);
        System.out.println(lhs);

        //size
        System.out.println(lhs.size());

        //clear
        // lhs.clear();
        System.out.println(lhs);

        // isEmpty
        System.out.println(lhs.isEmpty());
        
        // iterate
        // using Iterator

        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        // using for-each
        System.out.println();
        for(Integer k : lhs){
            System.out.print(k+ " ");
        }
    }
}