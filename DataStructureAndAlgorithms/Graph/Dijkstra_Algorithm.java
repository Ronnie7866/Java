package DataStructureAndAlgorithms.Graph;

import java.util.*;

public class Dijkstra_Algorithm {
    public static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void buildGraph(ArrayList<Edge> graph[]) {
        // initialise empty list in each array in graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        public Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair o) {
            return this.distance - o.distance;
        }
    }

    public static int[] dijkstra(ArrayList<Edge> graph[], int V, int source) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[V];
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[source] = 0;
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int src = e.source;
                    int dest = e.destination;
                    // relaxation
                    if (ans[src] + e.weight < ans[dest]) {
                        ans[dest] = ans[src] + e.weight;
                    }
                    pq.add(new Pair(dest, ans[dest]));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        buildGraph(graph);
        int[] ans = dijkstra(graph, V, 0);
        System.out.println(Arrays.toString(ans));
    }
}