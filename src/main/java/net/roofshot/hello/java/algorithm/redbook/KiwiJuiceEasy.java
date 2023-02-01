package net.roofshot.hello.java.algorithm.redbook;

/**
 * https://arena.topcoder.com/#/u/practiceCode/14359/13281/11020/2/305508
 * == Problem Statement ==
 *
 * Taro has prepared delicious kiwi fruit juice. He poured it into N bottles numbered from 0 to N-1. The capacity of the i-th bottle is capacities[i] liters, and he poured bottles[i] liters of kiwi juice into this bottle.
 *
 * Now he wants to redistribute juice in the bottles. In order to do this, he will perform M operations numbered from 0 to M-1 in the order in which he will perform them. For the i-th operation, he will pour kiwi juice from bottle fromId[i] to bottle toId[i]. He will stop pouring when bottle fromId[i] becomes empty or bottle toId[i] becomes full, whichever happens earlier.
 *
 * Return an that contains exactly N elements and whose i-th element is the amount of kiwi juice in the i-th bottle after all pouring operations are finished.
 */
public class KiwiJuiceEasy {

    private int[] capacities;   // capacity of the i-th bottle
    private int[] bottles;      // liters of kiwi juice in the i-th bottle

    public KiwiJuiceEasy(int[] capacities, int[] bottles) {
        this.capacities = capacities;
        this.bottles = bottles;
    }

    private int getJuice(int id) {
        return bottles[id];
    }

    private void setJuice(int id, int litersOfJuice) {
        bottles[id] = litersOfJuice;
    }

    private int getCapacity(int id) {
        return capacities[id];
    }

    private void operate(int fromId, int toId) {
        if (getJuice(fromId) + getJuice(toId) < getCapacity(toId)) {
            setJuice(toId, +getJuice(fromId) + getJuice(toId));
            setJuice(fromId, 0);
        } else {
            setJuice(fromId, getJuice(fromId) - (getCapacity(toId) - getJuice(toId)));
            setJuice(toId, +getCapacity(toId));
        }
    }

    public int[] redistrubute(int numOfOperations, int[] from, int[] to) {

        for (int i = 0; i < numOfOperations; i++) {
            operate(from[i], to[i]);
        }

        return this.bottles;
    }
}
