
import java.util.*;

public class PriorityQ {

    static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        /*PriorityQueue<Integer> pq = new PriorityQueue<>();
         //                                             ^
                                                        |
        //if you want data in discanding order   (Comparator.reverseOrder())
        
        pq.add(10);
        pq.add(6);
        pq.add(3);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
         */


        // compare class's object
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 31));
        pq.add(new Student("G", 13));
        pq.add(new Student("Y", 34));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }

    }
}
