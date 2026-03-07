// MST Greedy (Same as prims)
import java.util.*;

public class Kruskal_sAlgorithm{
    static class Edge implements Comparable<Edge>{
        int s;
        int d;
        int w;
        public Edge(int s,int d,int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }

        @Override
        public int compareTo(Edge e2){
            return this.w - e2.w;
        }
    }

    static void creategraph(ArrayList<Edge> graph){
        //
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));      
        graph.add(new Edge(0, 3, 30));   
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }

    static int n = 4; // vertices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;   
        }
        return find(par[x]);
    }

    public static void union(int u,int v){
        int para = find(u);
        int parb = find(v);

        if(rank[para] == rank[parb]){
            par[parb] = para;
            rank[para]++;
        }else if(rank[para] < rank[parb]){
            par[para] = parb;
        }else{
            par[parb] = para;
        }
    }

    public static void kruskalsMST(ArrayList<Edge> edges,int V){
        init(); 
        Collections.sort(edges); // O(E logE)
        int mstcost = 0;
        int count = 0;
        for(int i=0;count<V-1;i++){ //O(V)
            Edge e = edges.get(i);
            int para = find(e.s);
            int parb = find(e.d);
            if(para != parb){
                union(para,parb);
                mstcost += e.w;
                count++;
            }
        }
        System.out.println(mstcost);
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        creategraph(edges);
        kruskalsMST(edges,V);
    }

}