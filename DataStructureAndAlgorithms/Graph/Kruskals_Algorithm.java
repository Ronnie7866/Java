package DataStructureAndAlgorithms.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Kruskals_Algorithm {

    public static int find(int x, int[] parent) {
        if (parent[x] == x) {
            return x;
        }
        return find(parent[x], parent);
    }

    public static void union(int x, int y, int[] parent) {
        int a = find(x, parent);
        int b = find(y, parent);
        parent[b] = a;
    }

    public static int kruskal(ArrayList<int[]> edge, int V, int[] parent) {
        // sort the arraylist
        Collections.sort(edge, Comparator.comparingInt(value -> value[2]));
        PriorityQueue<int[]> pq = new PriorityQueue<>();
        int cost = 0;

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int[] i : edge) {
            int source = i[0];
            int destination = i[1];
            int weight = i[2];

            // check for cycle source and destination cannot have same parents
            if (find(source, parent) != find(destination, parent)) {
                cost += weight;
                union(source, destination, parent);
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int V = 6;
        int[] parent = new int[V];
        ArrayList<int[]> edge = new ArrayList<>();
        edge.add(new int[]{0, 1, 2});
        edge.add(new int[]{0, 2, 3});
        edge.add(new int[]{1, 2, 1});
        edge.add(new int[]{1, 3, 4});
        edge.add(new int[]{2, 3, 5});

        int ans = kruskal(edge, V, parent);
        System.out.println(ans);
    }
}