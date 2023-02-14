package net.roofshot.hello.java.algorithm.hackerrank;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewYearChaosTest {

    @Test
    public void testCase1() {

        List<Integer> q = Arrays.asList(1,2,3,5,4,6,7,8);

        String actual = new NewYearChaos().minimumBribes(q);

        Assertions.assertEquals("1", actual);
    }

    @Test
    public void testCase2() {

        List<Integer> q = Arrays.asList(4,1,2,3);

        String actual = new NewYearChaos().minimumBribes(q);

        Assertions.assertEquals("Too chaotic", actual);
    }

    @Test
    public void testCase3() {

        List<Integer> q = Arrays.asList(2,5,1,3,4);

        String actual = new NewYearChaos().minimumBribes(q);

        Assertions.assertEquals("Too chaotic", actual);
    }

    @Test
    public void testCase4() {

        List<Integer> q = Arrays.asList(2,1,5,3,4);

        String actual = new NewYearChaos().minimumBribes(q);

        Assertions.assertEquals("3", actual);
    }

    @Test
    public void testCase5() {

        List<Integer> q = Arrays.asList(1,2,5,3,7,8,6,4);

        String actual = new NewYearChaos().minimumBribes(q);

        Assertions.assertEquals("7", actual);
    }

    @Test
    public void testCase6() {

        String s = "123";
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(0,s.length()));
    }


}
