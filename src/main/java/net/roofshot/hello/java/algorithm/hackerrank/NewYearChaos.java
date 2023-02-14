package net.roofshot.hello.java.algorithm.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem
 */
public class NewYearChaos {

    public String minimumBribes(List<Integer> q) {

        Deque<Integer> stack = new ArrayDeque();
        stack.push(0);

        Map<Integer, Integer> bribes = new HashMap<>();
        int totalBribes = 0;

        while(!stack.isEmpty()) {

            int currentIdx = stack.pop();
            System.out.println(String.format("%s, %d",q, currentIdx));

            if(q.size() == currentIdx+1) continue;
            if(q.get(currentIdx) < q.get(currentIdx+1)) {
                if (currentIdx + 1 < q.get(currentIdx)) {
                    stack.push(currentIdx);
                }
                stack.push(currentIdx+1);
                continue;
            }

            totalBribes++;

            int target = q.get(currentIdx);
            q.set(currentIdx, q.get(currentIdx+1));
            q.set(currentIdx+1, target);

            stack.push(currentIdx+1);

            // countBribes;
            if(bribes.containsKey(target)) {
                bribes.put(target, bribes.get(target) + 1);
            } else {
                bribes.put(target, 1);
            }

            System.out.println(bribes);

            if (bribes.get(target) > 2) {
                return "Too chaotic";
            }
        }

        return ""+totalBribes;
    }
}
