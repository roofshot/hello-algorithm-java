package net.roofshot.hello.java.algorithm.base.util;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Deque.html
 *
 * @param <E>
 */
public class HelloStack<E> {

    private Deque<E> stack;

    public HelloStack() {
        this.stack = new ArrayDeque<E>();
    }

    public void push(E e) {
        this.stack.addLast(e);
    }

    public E pop() {
        return this.stack.pollLast();
    }
    public E peek() {
        return this.stack.getLast();
    }

    public int size() {
        return this.stack.size();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

}
