import java.util.*;

public class BFS_DFS {

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

    public static void BFS(ArrayList<Edge> graph[]){  // O(V+E) if V is big then time complexity bassed on v else based on E 
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0); // source = 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){ // visit curr 
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i); 
                    q.add(e.des);
                }
            }
        } 
    }

    public static void DFS(ArrayList<Edge> graph[],int curr,boolean visited[]){ // O(V+E)
        // Visit
        System.out.print(curr+" ");
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.des]){
                DFS(graph, e.des, visited);
            }
            
        }
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
        System.out.print("Using BFS : ");
        BFS(graph);
        System.out.println();
        System.out.print("Using DFS : ");
        DFS(graph,0,new boolean[V]);
    }
}
