package net.roofshot.hello.java.algorithm.jongmanbook;

import java.util.ArrayList;
import java.util.List;
import net.roofshot.hello.java.algorithm.jongmanbook.ShortestPathProblem.Edge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathProblemTest {

    @Test
    public void testFindAllPaths() {

        List<List<Edge>> adj = new ArrayList<>();
        adj.add(List.of(new Edge(1, 2), new Edge(2, 5)));
        adj.add(List.of(new Edge(0, 2), new Edge(2, 2)));
        adj.add(List.of(new Edge(0, 5), new Edge(1, 2), new Edge(3, 3)));
        adj.add(List.of(new Edge(2, 3)));

        ShortestPathProblem shortestPathFind = new ShortestPathProblem(adj);

        int[] actual = shortestPathFind.dijkstra(0, 4);
        Assertions.assertEquals(7, actual[3]);
    }

    @Test
    public void testFindAllPaths2() {

        List<List<Edge>> adj = new ArrayList<>();
        adj.add(List.of(new Edge(1, 2), new Edge(2, 1)));
        adj.add(List.of(new Edge(0, 2), new Edge(2, 2)));
        adj.add(List.of(new Edge(0, 1), new Edge(1, 2), new Edge(3, 3)));
        adj.add(List.of(new Edge(2, 3)));

        ShortestPathProblem shortestPathFind = new ShortestPathProblem(adj);

        int[] actual = shortestPathFind.dijkstra(0, 4);
        Assertions.assertEquals(4, actual[3]);
    }
}
