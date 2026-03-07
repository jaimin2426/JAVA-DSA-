
import java.util.*;

public class ArticulationPoint{
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));


    }

    public static void dfs(ArrayList<Edge> graph[],int curr,int par, int dt[],int low[],boolean vis[],int time,boolean ap[]){
        //O(V+E)
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i); // e.src --- e.des
            int neigh = e.des;
            if(neigh == par){
                continue;
            }
            else if(!vis[neigh]){
                dfs(graph, neigh, curr, dt, low, vis, time,ap);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(par != -1 && dt[curr] <= low[neigh]){  // only par != -1 is new remain all same as bridge
                    ap[curr] = true;
                }
                child++; // new remain same 
            }else{
                low[curr] = Math.min(low[curr],dt[neigh]);
            }
        }
        if(par == -1 && child > 1){  // new remain same 
            ap[curr] = true;
        }

    }
    public static void articulationPoint(ArrayList<Edge> graph[],int v){
        int dt[] = new int[v]; // discovery time 
        int low[] = new int[v]; // lowes discovery time
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time,ap);
            }
        }

        for(int i=0;i<v;i++){
            if(ap[i]){
                System.out.println("ArticulationPoint: "+i);
            }
        }

    }

    public static void main(String args[]){
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        articulationPoint(graph, V);
    }
}