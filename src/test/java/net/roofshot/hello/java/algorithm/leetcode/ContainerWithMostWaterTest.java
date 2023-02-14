package net.roofshot.hello.java.algorithm.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void testCase1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        int actual = containerWithMostWater.maxArea(height);

        Assertions.assertEquals(49, actual);
    }

    @Test
    public void testCase2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = new int[]{1,1};

        int actual = containerWithMostWater.maxArea(height);

        Assertions.assertEquals(1, actual);
    }

}
