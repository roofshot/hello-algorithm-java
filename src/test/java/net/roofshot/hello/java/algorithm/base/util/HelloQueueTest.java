package net.roofshot.hello.java.algorithm.base.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.roofshot.hello.java.algorithm.base.util.HelloQueue.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloQueueTest {

    @Test
    public void testPriorityQueue() {

        int[] params = new int[] {4, 10, 9, 8, 1};
        List<Pair> elements = new ArrayList<>();
        Arrays.stream(params).forEach(e -> elements.add(new Pair(e, 0)));

        HelloQueue helloQueue = new HelloQueue(elements);
        Assertions.assertEquals(1, helloQueue.peek());
        Assertions.assertEquals(1, helloQueue.poll());
        Assertions.assertEquals(4, helloQueue.poll());
        Assertions.assertEquals(8, helloQueue.poll());
    }

}
