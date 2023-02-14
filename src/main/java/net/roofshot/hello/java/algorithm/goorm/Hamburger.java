package net.roofshot.hello.java.algorithm.goorm;

import java.util.TreeMap;

/**
 * 햄버거 마다 각각 데우는 시간, 먹는시간이 다름.
 * 꼭 먼저 데워서 먹어야 하는데, 전자레인지가 1개 있음.
 * N 개의 햄버거가 있을 때, 전체 먹는시간을 최소화 하는 방법 구현
 */
public class Hamburger {

    class Burger {

        private Integer eat;
        private Integer warm;
        private Integer index;

        public Burger(int eat, int warm, int index) {
            this.eat = eat;
            this.warm = warm;
            this.index = index;
        }

        public Integer getEat() {
            return this.eat;
        }

        public Integer getWarm() {
            return this.warm;
        }

        public Integer getTotalTime() {
            return getEat() + getWarm();
        }

        public Integer getIndex() {
            return this.index;
        }

        public String toString() {
            return String.format("tt=%d, warm=%d, eat=%d, index=%d", getTotalTime(), this.warm,
                    this.eat, this.index);
        }
    }

    public int minLunchTime(int[] timeForEat, int[] timeForWarm) {

        TreeMap<Burger, Integer> tree = buildTree(timeForEat, timeForWarm);

        int prevCumulativeWarmTime = 0;
        int totalLunchTime = 0;
        while (!tree.isEmpty()) {
            Burger burger = tree.pollFirstEntry().getKey();

            int thisLunchTime = prevCumulativeWarmTime + burger.getWarm() + burger.getEat();
            totalLunchTime = Math.max(totalLunchTime, thisLunchTime);

            DEBUG(prevCumulativeWarmTime, burger.getWarm(), burger.getEat(), thisLunchTime,
                    totalLunchTime);

            prevCumulativeWarmTime += burger.getWarm();
        }
        return totalLunchTime;
    }

    public TreeMap<Burger, Integer> buildTree(int[] timeForEat, int[] timeForWarm) {

        TreeMap<Burger, Integer> tree = new TreeMap<>(
                (o1, o2) -> {
                    if (o2.getEat().compareTo(o1.getEat()) != 0) {
                        return o2.getEat().compareTo(o1.getEat());
                    } else if (o1.getWarm().compareTo(o2.getWarm()) != 0) {
                        return o1.getWarm().compareTo(o2.getWarm());
                    } else {
                        return o1.getIndex().compareTo(o2.getIndex());
                    }
                }
        );

        for (int i = 0; i < timeForEat.length; i++) {
            Burger burger = new Burger(timeForEat[i], timeForWarm[i], i);
            tree.put(burger, i);
        }
        return tree;
    }

    public void DEBUG(int prev, int warm, int eat, int thisLunch, int totalLunch) {

        System.out.println(String.format(">>> prev=%d warm=%d eat=%d this=%d total=%d",
                prev, warm, eat, thisLunch, totalLunch
        ));

    }
}
