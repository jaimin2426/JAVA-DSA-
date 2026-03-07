
import java.util.ArrayList;

/*
Cheapest Flights within K Stops

There are n cities connected by some number of flights. You are given an array flights where
flights[i] = [from, to, price] indicates that there is a flight.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.

If there is no such route, return -1.

all values are positive
 */
import java.util.*;

public class ChepestFlightsWithinKStops {

    static class Edge {

        int src;
        int des;
        int stops;

        public Edge(int src, int des, int k) {
            this.src = src;
            this.des = des;
            this.stops = k;
        }
    }

    public static void creategraph(int flight[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int des = flight[i][1];
            int stops = flight[i][2];

            Edge e = new Edge(src, des, stops);
            graph[src].add(e);
        }
    }

    static class info {

        int vertex;
        int cost;
        int stops;

        public info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }
    @SuppressWarnings("unchecked")
    public static int chepestflight(int n, int flights[][], int src, int des, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        creategraph(flights, graph);

        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<info> q = new LinkedList<>();
        q.add(new info(src, 0, 0));

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr.stops > k) {
                break;
            }

            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int u = e.src;
                int v = e.des;
                int w = e.stops;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v] && curr.stops <= k) { // update distance of src to v
                    dist[v] = dist[u] + w;
                    q.add(new info(v, dist[v], curr.stops + 1));
                }
            }
        }
        //dist[dest]
        if (dist[des] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[des];
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, des = 3, k = 1;
        System.out.println(chepestflight(n, flights, src, des, k));
    }
}
