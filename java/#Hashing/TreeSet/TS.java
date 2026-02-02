import java.util.*;

public class TS{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>();

        // add elements O(log n)
        ts.add(5);
        ts.add(20);
        ts.add(1);
        ts.add(3);
        ts.add(7);
        ts.add(9);
        ts.add(8);
        ts.add(10);
        ts.add(3); // duplicate ignored
        System.out.println(ts);

        // contains O(log n)
        System.out.println(ts.contains(3));
        System.out.println(ts.contains(7));

        // remove O(log n)
        ts.remove(1);
        System.out.println(ts);

        //size
        System.out.println(ts.size());

        //clear
        // ts.clear();
        System.out.println(ts);

        // isEmpty
        System.out.println(ts.isEmpty());
        
        // iterate
        // using Iterator

        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        // using for-each
        System.out.println();
        for(Integer k : ts){
            System.out.print(k+ " ");
        }
    }
}