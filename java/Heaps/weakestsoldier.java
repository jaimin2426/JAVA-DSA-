
import java.util.PriorityQueue;

/*
Weakest Soldier

We are given an m × n binary matrix of 1’s (soldiers) and 0’s (civilians).
The soldiers are positioned in front of the civilians. That is, all the 1’s will appear to the left of all the 0’s in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.

Both rows have the same number of soldiers and i < j.

Find the K weakest rows.
 */

public class weakestsoldier {

    static class row implements Comparable<row> {

        int soldier;
        int idx;

        public row(int soldier, int idx) {
            this.idx = idx;
            this.soldier = soldier;
        }

        @Override
        public int compareTo(row r2) {
            if (this.soldier == r2.soldier) {
                return this.idx - r2.idx;
            } else {
                return this.soldier - r2.soldier;
            }
        }
    }

    public static void main(String args[]) {
        int army[][] = {{1, 0, 0, 0},
        {1, 1, 1, 1},
        {1, 0, 0, 0},
        {1, 0, 0, 0}
        };
        int k = 2;

        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count = 0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j] == 1 ? 1 : 0; 
            }
            pq.add(new row(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
