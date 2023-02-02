package net.roofshot.hello.java.algorithm.redbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathFindTest {

    @Test
    public void testFindAllPaths() {

        int[][] edge = new int[][]{
                {1, 2},
                {0, 2},
                {0, 1, 3},
                {2}
        };
        int[][] dist = new int[][]{
                {2, 5},
                {2, 2},
                {5, 2, 3},
                {3}
        };

        ShortestPathFind shortestPathFind = new ShortestPathFind(edge, dist);

        int actual = shortestPathFind.dijkstra(0, 3, 4);
        Assertions.assertEquals(7, actual);
    }
}
