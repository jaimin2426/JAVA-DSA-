import java.util.*;

public class HS{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        // add elements O(1)
        set.add(5);
        set.add(20);
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(9);
        set.add(8);
        set.add(10);
        set.add(3); // duplicate ignored
        System.out.println(set);

        // contains O(1)
        System.out.println(set.contains(3));
        System.out.println(set.contains(7));

        // remove O(1)
        set.remove(1);
        System.out.println(set);

        //size
        System.out.println(set.size());

        //clear
        // set.clear();
        System.out.println(set);

        // isEmpty
        System.out.println(set.isEmpty());
        
        // iterate
        // using Iterator

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        // using for-each
        System.out.println();
        for(Integer k : set){
            System.out.print(k+ " ");
        }

    }
}