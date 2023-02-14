package net.roofshot.hello.java.algorithm.goorm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HamburgerTest {

    @Test
    public void tc1() {

        int[] timeForWarm = new int[]{1, 2, 1};
        int[] timeForEat = new int[]{1, 2, 3};

        Hamburger hamburger = new Hamburger();
        int actual = hamburger.minLunchTime(timeForEat, timeForWarm);

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void tc2() {

        int[] timeForWarm = new int[]{2, 2, 2};
        int[] timeForEat = new int[]{2, 2, 2};

        Hamburger hamburger = new Hamburger();
        int actual = hamburger.minLunchTime(timeForEat, timeForWarm);

        Assertions.assertEquals(8, actual);
    }

    @Test
    public void tc3() {

        int[] timeForWarm = new int[]{3, 3, 1};
        int[] timeForEat = new int[]{1, 3, 3};

        Hamburger hamburger = new Hamburger();
        int actual = hamburger.minLunchTime(timeForEat, timeForWarm);

        Assertions.assertEquals(8, actual);
    }
}
