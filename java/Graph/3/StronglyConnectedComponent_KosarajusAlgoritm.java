
import java.util.*;

public class StronglyConnectedComponent_KosarajusAlgoritm{
    static class Edge{
        int src;
        int des;
        public Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }

    
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void toposort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                toposort(graph, e.des, vis, s);
            }
        }
        s.push(curr); 
    }

    public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                dfs(graph, e.des, vis);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void kosaraju(ArrayList<Edge> graph[],int V){
        // step 1

        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                toposort(graph, i, vis, s);
            }
        }

        //step 2
        ArrayList<Edge> tarnspose[] = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i] = false;
            tarnspose[i] = new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);  // e.src->e.dec
                tarnspose[e.des].add(new Edge(e.des,e.src));  //e.dec->e.src
            }
        }

        // step 3

        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("scc-> ");
                dfs(tarnspose,curr,vis); // scc 
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        kosaraju(graph, V);
    }
}