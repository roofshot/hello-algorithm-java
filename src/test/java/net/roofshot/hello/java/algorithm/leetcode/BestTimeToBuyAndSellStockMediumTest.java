package net.roofshot.hello.java.algorithm.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockMediumTest {

    @Test
    public void testCase1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        BestTimeToBuyAndSellStockMedium problem = new BestTimeToBuyAndSellStockMedium();
        int actual = problem.maxProfit(prices);

        Assertions.assertEquals(7, actual);
    }

    @Test
    public void testCase2() {
        int[] prices = new int[]{1, 2, 3, 4, 5};

        BestTimeToBuyAndSellStockMedium problem = new BestTimeToBuyAndSellStockMedium();
        int actual = problem.maxProfit(prices);

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void testCase3() {
        int[] prices = new int[]{7, 6, 4, 3, 1};

        BestTimeToBuyAndSellStockMedium problem = new BestTimeToBuyAndSellStockMedium();
        int actual = problem.maxProfit(prices);

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testCase4() {
        int[] prices = new int[]{5, 1, 4, 3, 8};

        BestTimeToBuyAndSellStockMedium problem = new BestTimeToBuyAndSellStockMedium();
        int actual = problem.maxProfit(prices);

        Assertions.assertEquals(8, actual);
    }
}
