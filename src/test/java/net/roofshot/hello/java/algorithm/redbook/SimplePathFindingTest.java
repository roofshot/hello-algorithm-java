package net.roofshot.hello.java.algorithm.redbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplePathFindingTest {

    @Test
    public void testFindAllPaths() {
        SimplePathFinding simplePathFinding = new SimplePathFinding(5, 4);

        int actual = simplePathFinding.findAllPath(0, 0);
        Assertions.assertEquals(126, actual);

    }

    @Test
    public void testFindAllPathsWithMemo() {
        SimplePathFinding simplePathFinding = new SimplePathFinding(5, 4);

        int actual = simplePathFinding.findAllPathWithMemo(0, 0);
        Assertions.assertEquals(126, actual);
    }

    @Test
    public void testFindAllPathsWithDP() {
        SimplePathFinding simplePathFinding = new SimplePathFinding(5, 4);

        int actual = simplePathFinding.findAllPathWithDP(5, 4);
        Assertions.assertEquals(126, actual);
    }
}
