package net.roofshot.hello.java.algorithm.redbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiwiJuiceEasyTest {

    @Test
    public void testCase1() {
        int[] capacities = new int[]{20, 20};
        int[] bottles = new int[]{5, 8};

        int m = 1;
        int[] from = new int[]{0};
        int[] to = new int[]{1};
        int[] expected = new int[]{0, 13};

        KiwiJuiceEasy kiwiJuiceEasy = new KiwiJuiceEasy(capacities, bottles);

        int[] actual = kiwiJuiceEasy.redistrubute(m, from, to);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] capacities = new int[]{10, 10};
        int[] bottles = new int[]{5, 8};

        int m = 1;
        int[] from = new int[]{0};
        int[] to = new int[]{1};
        int[] expected = new int[]{3, 10};

        KiwiJuiceEasy kiwiJuiceEasy = new KiwiJuiceEasy(capacities, bottles);

        int[] actual = kiwiJuiceEasy.redistrubute(m, from, to);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int[] capacities = new int[]{30, 20, 10};
        int[] bottles = new int[]{10, 5, 5};

        int m = 3;
        int[] from = new int[]{0, 1, 2};
        int[] to = new int[]{1, 2, 0};
        int[] expected = new int[]{10, 10, 0};

        KiwiJuiceEasy kiwiJuiceEasy = new KiwiJuiceEasy(capacities, bottles);

        int[] actual = kiwiJuiceEasy.redistrubute(m, from, to);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        int[] capacities = new int[]{700000, 800000, 900000, 1000000};
        int[] bottles = new int[]{478478, 478478, 478478, 478478};

        int m = 5;
        int[] from = new int[]{2, 3, 2, 0, 1};
        int[] to = new int[]{0, 1, 1, 3, 2};
        int[] expected = new int[]{0, 156956, 900000, 856956};

        KiwiJuiceEasy kiwiJuiceEasy = new KiwiJuiceEasy(capacities, bottles);

        int[] actual = kiwiJuiceEasy.redistrubute(m, from, to);
        Assertions.assertArrayEquals(expected, actual);
    }
}
