import java.util.*;

public class BiPartite {

    static class Edge {

        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //               Edge(src,des)
        // 0 -> vertex 
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 2));

        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 2));
    }
    
    // O(V+V)
    public static boolean isbipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i] ==  -1){ // BFS
                q.add(i);
                col[i] = 0;  //yellow
                while(!q.isEmpty()) { 
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.des] == -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.des] = nextcol;
                            q.add(e.des);
                        }else if(col[e.des] == col[curr]){
                            return false; // not Bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        /*        

        0---------1-----3
        |               |
        2---------------4
         */
        int V = 5;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        System.out.print("Using DFS : "+isbipartite(graph));
        
    }
}
