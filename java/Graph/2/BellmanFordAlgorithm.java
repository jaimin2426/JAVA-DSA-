// Shortest paths from the source to all vartices(Negative Edges)
import java.util.*;

public class BellmanFordAlgorithm {

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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        // 1 -> verte
        
        graph[1].add(new Edge(1, 2, -4));

        // 2 -> vertex
        graph[2].add(new Edge(2, 3, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 4, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanford(ArrayList<Edge> graph[],int s){ // O(V*E)
        int dist[] = new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i != s){
                dist[i] = Integer.MAX_VALUE; // +infinity
            }
        }

        // Algorithm O(V)
        int V = graph.length;
        for(int i=0;i<V-1;i++){
            //edges - O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.des;
                    int w = e.weight;

                    // relexation 
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                        dist[v] = dist[u] + w;
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
        
        int V = 5;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        int src = 0;
        bellmanford(graph, src);

    }
}
