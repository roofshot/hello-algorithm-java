package net.roofshot.hello.java.algorithm.leetcode;

public class BestTimeToBuyAndSellStockMedium {

    public int maxProfit(int[] prices) {

        int prevPrice = prices[0];
        int sum = 0;
        for(int i = 1; i < prices.length ; i++) {
            if(prices[i] > prevPrice) {
                sum = sum + (prices[i] - prevPrice);
            }
            prevPrice = prices[i];
        }
        return sum;
    }


    public int maxProfit_es(int[] prices) {

        int l = 0;
        int r = 1;

        int sum = 0;

        while(r < prices.length) {
            System.out.println(String.format("l=%d, r=%d, max=%d", l, r, sum));
            if(prices[r] - prices[l] > 0) {
                sum += prices[r] - prices[l];
                l = r;
                r++;
            } else if(prices[l] > prices[r]) {
                l = r;
                r++;
            } else {
                r++;
            }
        }

        return sum;
    }

}
