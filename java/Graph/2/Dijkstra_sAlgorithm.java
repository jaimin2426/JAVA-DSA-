// Shortest paths from the source to all vartices(weighted graph)
import java.util.*;

public class Dijkstra_sAlgorithm {

    static class Edge {

        int src;
        int des;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.weight = w;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //               Edge(src,des,weight)
        // 0 -> vertex 
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2, 2));

    }

    static class pair implements Comparable<pair> {

        int n;
        int path;

        public pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            return this.path - p2.path; //path based sorting 
        }
    }

    public static void dijkstras(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; //dist[i]  -> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; //+infinity

            }
        }
        boolean visit[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, 0));

        //loop
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!visit[curr.n]) {
                visit[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.des;
                    int w = e.weight;

                    if (dist[u] + w < dist[v]) { // update distance of src to v
                        dist[v] = dist[u] + w;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }

        // parint all source to veritices sortest distance 
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.err.println();

    }

    public static void main(String args[]) {
        /*        (5)
                       0-----1              
                           /  \             
                      (1) /     \  (3)       
                        2--------3
                        |  (1)
                    (2) |
                        4        
         */
        int V = 5;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        int src = 0;
        dijkstras(graph, src);

    }
}
