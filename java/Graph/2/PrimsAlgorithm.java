/*
Minimum Spanning Tree (MST)

A minimum spanning tree (MST) or minimum weight spanning tree is a subset of the edges of a connected, 
edge-weighted undirected graph that connects all the vertices together, 
without any cycles and with the minimum possible total edge weight.

*/

// Shortest paths from the source to all vartices(Negative Edges)
import java.util.*;

public class PrimsAlgorithm {

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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        // 1 -> verte
        
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        // 3 -> vertex
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

        

    }

    static class pair implements Comparable<pair> {

        int v;
        int cost;

        public pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost; //cost based sorting 
        }
    }
    public static void prims(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0,0));
        int finalcost = 0; // MST total minimum weight

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalcost += curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.des,e.weight));
                }   
            }
        }

        System.out.println("Final Minimum cost of MST is :"+ finalcost);
    }
    public static void main(String args[]) {
        
        int V = 4;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        int src = 0;
        prims(graph);

    }
}
