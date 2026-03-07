import java.util.*;

public class AllPathsFromSourceToTarget {

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

        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        
    }
    
    // O(V+V)
    public static void allpath(ArrayList<Edge>[] graph,int src,int dec,String path){
        if(src == dec){
            System.out.println(path+dec);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            allpath(graph, e.des, dec,  path + src + " ");
        }

    }

    public static void main(String args[]) {
        
        int V = 6;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 
        ArrayList<Edge> graph[] = new ArrayList[V];
        int src = 5,dec = 1;
        creategraph(graph);
        allpath(graph, src, dec, "");
        
    }
}
