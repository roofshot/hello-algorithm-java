package net.roofshot.hello.java.algorithm.redbook;

public class ShortestPathFind {

    public static final int MAX = (int) 1e9;

    int[][] edge; // 정점 i 의 j번째 변의 목적지
    int[][] dist; // 정점 i 의 j번째 변의 비용

    public ShortestPathFind(int[][] edge, int[][] dist) {
        this.edge = edge;
        this.dist = dist;
    }

    public int dijkstra(int from, int to, int vertex) {
        int[] d = new int[vertex];              // from 부터의 거리를 저장하는 배열
        boolean[] check = new boolean[vertex];  // 큐에 들어있는 정점을 저장하는 배열

        for (int i = 0; i < vertex; i++) {
            d[i] = MAX;
        }
        d[from] = 0;

        for (int i = 0; i < vertex; i++) {
            int now = 0;
            int nowd = MAX;

            // 탐색하지 않은 정점 중 가장 가까운 정점을 now 에 추가
            for (int j = 0; j < vertex; j++) {
                if (nowd > d[j] && !check[j]) {
                    nowd = d[j];
                    now = j;
                }
            }

            if (nowd == MAX) {
                break;
            }
            check[now] = true;

            for (int j = 0; j < edge[now].length; j++) {
                int next = edge[now][j];
                int nextd = d[now] + dist[now][j];
                if (nextd < d[next]) {
                    d[next] = nextd;
                }
            }
        }

        for (int i = 0; i < check.length; i++) {
            System.out.println(String.format("%d, %s", i, check[i]));
        }
        return d[to];
    }
}
