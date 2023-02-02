package net.roofshot.hello.java.algorithm.base;

import java.util.PriorityQueue;

public class BaseShortestPathFinder {

    public static final int MAX = (int) 1e9;

    private int[][] edges;              // 정점 i 의 j번째 변의 목적지
    private int[][] distances;          // 정점 i 의 j번째 변의 비용
    private int vertexCount;
    private PriorityQueue<DistanceVertex> priorityQueue;

    public BaseShortestPathFinder(int[][] edges, int[][] distances) {
        this.edges = edges;
        this.distances = distances;
        this.vertexCount = edges.length;
        this.priorityQueue = new PriorityQueue<>(
                (o1, o2) -> Integer.compare(o1.getDistance(), o2.getDistance())
        );
    }

    public int[] findPath(int from, int to) {
        int[] parent = new int[this.edges.length];
        dijkstra(from, to, parent);
        return parent;
    }

    private int dijkstra(int from, int to, int[] parent) {

        // from 부터 각 정점까지의 최단 거리를 담는 배열
        int[] shortestDistance = new int[this.vertexCount];

        // 배열 초기화
        for (int i = 0; i < this.vertexCount; i++) {
            shortestDistance[i] = MAX;
            parent[i] = -1;
        }

        // 시작 지점의 거리는 0
        shortestDistance[from] = 0;

        // 시작 지점을 탐색 대상으로 등록
        this.priorityQueue.add(new DistanceVertex(0, from));

        while (!this.priorityQueue.isEmpty()) {
            DistanceVertex currentDV = this.priorityQueue.poll();

            // 시작->현재 정점까지 더 짧은 경로가 있다면, 이 경로는 탐색하지 않음
            if (shortestDistance[currentDV.getVertex()] < currentDV.getDistance()) {
                continue;
            }

            for (int i = 0; i < this.edges[currentDV.getVertex()].length; i++) {
                int nextV = this.edges[currentDV.getVertex()][i]; // 다음 정점들을 살펴보기

                // 현재까지 거리에서 다음 정점까지의 거리 더하기
                int nextDistance =
                        currentDV.getDistance() + this.distances[currentDV.getVertex()][i];

                // 다음 정점까지 거리가 이전 계산 보다 짧으면,
                if (nextDistance < shortestDistance[nextV]) {
                    shortestDistance[nextV] = nextDistance; // 최단 경로 수 업데이트
                    this.priorityQueue.add(new DistanceVertex(nextDistance, nextV)); // 다음 탐색 대상에 추가
                    parent[nextV] = currentDV.getVertex(); // 최단 경로 목록 저장
                }
            }
        }
        return shortestDistance[to];
    }

    class DistanceVertex {

        private int distance;
        private int vertex;

        public DistanceVertex(int distance, int vertex) {
            this.distance = distance;
            this.vertex = vertex;
        }

        public int getDistance() {
            return distance;
        }

        public int getVertex() {
            return vertex;
        }
    }
}
