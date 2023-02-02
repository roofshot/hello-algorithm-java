package net.roofshot.hello.java.algorithm.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseShortestPathFinderTest {

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

        BaseShortestPathFinder shortestPathFind = new BaseShortestPathFinder(edge, dist);

        int[] parent = shortestPathFind.findPath(0, 3);

        Assertions.assertEquals(parent[3], 2);
        Assertions.assertEquals(parent[2], 1);
        Assertions.assertEquals(parent[1], 0);
    }

}
