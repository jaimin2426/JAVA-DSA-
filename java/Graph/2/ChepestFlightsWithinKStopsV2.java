import java.util.*;

public class ChepestFlightsWithinKStopsV2{

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

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int des = flights[i][1];
            int price = flights[i][2];

            graph[src].add(new Edge(src, des, price));
        }
    }

    static class Info {
        int vertex;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }
    @SuppressWarnings("unchecked")
    public static int cheapestFlight(int n, int flights[][], int src, int des, int k) {

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.stops > k) {
                continue;
            }

            for (Edge e : graph[curr.vertex]) {
                int v = e.des;
                int w = e.weight;

                if (curr.cost + w < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + w;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        return dist[des] == Integer.MAX_VALUE ? -1 : dist[des];
    }

    public static void main(String args[]) {
        int n = 4;
        int flights[][] = {
                {0, 1, 100},
                {1, 2, 100},
                {2, 0, 100},
                {1, 3, 600},
                {2, 3, 200}
        };

        int src = 0, des = 3, k = 1;

        System.out.println(cheapestFlight(n, flights, src, des, k));
    }
}