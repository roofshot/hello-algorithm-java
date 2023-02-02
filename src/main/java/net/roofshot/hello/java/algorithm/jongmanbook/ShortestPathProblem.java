package net.roofshot.hello.java.algorithm.jongmanbook;

import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathProblem {

    public static final int MAX = (int) 1e9;

    // [
    //   [(1, 3), (2, 4)]
    //   [(0, 3)]
    //   [(0, 4)]
    // ]
    private List<List<Edge>> adj;

    public ShortestPathProblem(List<List<Edge>> adj) {
        this.adj = adj;
    }

    public int[] dijkstra(int from, int vertex) {

        int[] parent = new int[vertex];
        int[] dist = new int[vertex];
        for (int i = 0; i < vertex; i++) {
            dist[i] = MAX;
            parent[i] = -1;
        }

        dist[from] = 0;
        parent[from] = from;

        PriorityQueue<ShortestPathProblem.Pair> pq = new PriorityQueue<>(
                (o1, o2) -> Integer.compare(o1.getDistance(), o2.getDistance())
        );

        pq.add(new ShortestPathProblem.Pair(0, from));

        while (!pq.isEmpty()) {
            int cost = pq.peek().getDistance();
            int here = pq.peek().getVertex();
            pq.poll();

            if (dist[here] < cost) {
                continue;
            }

            for (int i = 0; i < adj.get(here).size(); i++) {
                int there = adj.get(here).get(i).toVertex;
                int nextDist = cost + adj.get(here).get(i).toDistance;

                if (dist[there] > nextDist) {
                    dist[there] = nextDist;
                    pq.add(new Pair(nextDist, there));
                    parent[there] = here;
                }
            }
        }

        for(int i = 0 ; i < parent.length ; i++) {
            System.out.println(String.format("v=%d, p=%d", i, parent[i]));
        }

        return dist;
    }

    class Pair {

        private int distance;
        private int vertex;

        public Pair(int distance, int vertex) {
            this.distance = distance;
            this.vertex = vertex;
        }

        public int getDistance() {
            return this.distance;
        }

        public int getVertex() {
            return this.vertex;
        }
    }

    static class Edge {

        int toVertex;
        int toDistance;

        public Edge(int toVertex, int toDistance) {
            this.toVertex = toVertex;
            this.toDistance = toDistance;
        }
    }
}
