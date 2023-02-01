package net.roofshot.hello.java.algorithm.base.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloStackTest {

    @Test
    public void testStackLILO() {
        HelloStack<Integer> helloStack = new HelloStack<>();
        Assertions.assertEquals(true, helloStack.isEmpty());

        helloStack.push(1);
        Assertions.assertEquals(1, helloStack.pop());
        Assertions.assertEquals(true, helloStack.isEmpty());

        helloStack.push(1);
        helloStack.push(2);
        helloStack.push(3);

        Assertions.assertEquals(false, helloStack.isEmpty());
        Assertions.assertEquals(3, helloStack.peek());
        Assertions.assertEquals(3, helloStack.size());

        Assertions.assertEquals(3, helloStack.pop());
        Assertions.assertEquals(2, helloStack.pop());
        Assertions.assertEquals(1, helloStack.pop());
        Assertions.assertEquals(true, helloStack.isEmpty());
    }

}
