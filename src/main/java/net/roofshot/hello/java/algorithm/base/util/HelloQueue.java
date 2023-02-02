package net.roofshot.hello.java.algorithm.base.util;

import java.util.List;
import java.util.PriorityQueue;

public class HelloQueue {

    static class Pair {

        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return this.key;
        }

        public int getValue() {
            return this.value;
        }
    }

    private PriorityQueue<Pair> pq;

    public HelloQueue(List<Pair> elements) {
        this.pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.getKey(), o2.getKey()));
        elements.stream().forEach(el -> pq.add(el));
    }

    public int poll() {
        return this.pq.poll().getKey();
    }

    public int peek() {
        return this.pq.peek().getKey();
    }

}
