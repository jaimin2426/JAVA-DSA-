
import java.util.PriorityQueue;

public class NearbyCars{

    static class points implements Comparable<points>{
        int x;
        int y;
        int distance;
        int idx;
        public points(int x, int y ,int dist,int idx){
            this.x = x;
            this.y = y;
            this.distance = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(points p2){
            return this.distance-p2.distance;
        }
    }
    public static void main(String args[]){
        int car_points[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<points> pq = new PriorityQueue<>();
        for(int i=0;i<car_points.length;i++){
            int distsqr = car_points[i][0]*car_points[i][0]+car_points[i][1]*car_points[i][1];
            pq.add(new points(car_points[i][0],car_points[i][1],distsqr,i));

        }

        // NearbyCars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }

    }
}