import java.util.*;

public class CycleInGraph {

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
        // graph[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> vertex
        // graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 2, 2));

        graph[6].add(new Edge(6, 7, 8));
        graph[6].add(new Edge(6, 9, 8));
    }
    public static void BFS(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                BFSUtil(graph, vis,i);
            }
        }
    }
    public static void BFSUtil(ArrayList<Edge> graph[],boolean vis[],int start){  // O(V+E) if V is big then time complexity bassed on v else based on E 
        Queue<Integer> q = new LinkedList<>();
        q.add(start); // source = 0

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

    public static boolean detectcycledfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(DFSUtil(graph,vis,i,-1)){
                    return true;
                    //cycle exist in one of the parts
                }
            }
        }
        return false;
    }
    public static boolean DFSUtil(ArrayList<Edge> graph[],boolean visited[],int curr,int par){ // O(V+E)

        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!visited[e.des]){
                if (DFSUtil(graph, visited, e.des,curr)) {
                    return true;
                }
                
            }

            // case 1
            else if(visited[e.des] && e.des != par){
                return true;
            }
            // case 2 -> do nothing 
        }
        return false;
    }
    public static void main(String args[]) {
        /*        (5)                   (8)
                0-----1              6-----7
                    /  \             | (8)
              (1) /     \  (3)       9
                2--------3
                |  (1)
            (2) |
                4        
         */
        int V = 10;
        // int arr[] = new int[]

        @SuppressWarnings("unchecked")  // Java does NOT allow direct creation of generic arrays 

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        System.out.print("Using BFS : ");
        BFS(graph);
        System.out.println();
        System.out.print("Using DFS : ");
        System.out.println(detectcycledfs(graph));
    }
}
