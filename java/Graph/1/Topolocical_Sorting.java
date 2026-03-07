
import java.util.*;

public class Topolocical_Sorting {

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

        //              Edge(src,des)
        
        // 1 -> vertex
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 4));

        // 3 -> vertex
        graph[3].add(new Edge(3, 4));

    }

    public static void topologicalsort(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<graph.length;i++){
            if(!vis[i]){
                topsortutilUtil(graph,i,vis,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void topsortutilUtil(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> st){ // O(V+E)
        // Visit
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.des]){
                topsortutilUtil(graph, e.des, visited, st);
            }
        }
        st.push(curr);
        
    }

    //using BFS kahn's aalgorithm

    public static void calculateindgree(ArrayList<Edge> graph[],int indgree[]){
        for(int i=0;i<graph.length;i++){
            int v = i;
            for(int j=0;j<graph[v].size();j++){
                Edge e = graph[v].get(j);
                indgree[e.des]++;
            }
        }
    } 
    public static void toposort(ArrayList<Edge> graph[]){
        int indegree[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        //
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indegree[e.des]--;
                if(indegree[e.des] == 0){
                q.add(e.des);
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        /*        
                    1(1 to 3 && 1 to 2)
                   / \
          (3 to 4)3   2(2 to 4)
                   \ /
                    4
         */
        int V = 5;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        topologicalsort(graph);
        System.out.println();
        toposort(graph);
    }
}
