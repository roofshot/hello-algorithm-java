package net.roofshot.hello.java.algorithm.redbook;

public class SimplePathFinding {

    private int w;
    private int h;
    private int[][] dp;
    private int count;

    public SimplePathFinding(int w, int h) {
        this.w = w;
        this.h = h;
        this.dp = new int[w + 1][h + 1];
        this.count = 0;
    }

    public int findAllPath(int sx, int sy) {
        int result = dfs(sx, sy);
        return result;
    }

    public int dfs(int x, int y) {
        this.count++;
        if (x > this.w || y > this.h) {
            return 0;
        }
        if (x == this.w && y == this.h) {
            return 1;
        }
        return dfs(x + 1, y) + dfs(x, y + 1);
    }

    public int findAllPathWithMemo(int sx, int sy) {
        int result = dfsWithMemo(sx, sy);
        return result;
    }

    public int dfsWithMemo(int x, int y) {
        this.count++;
        if (x > this.w || y > this.h) {
            return 0;
        }
        if (x == this.w && y == this.h) {
            return 1;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        dp[x][y] = dfsWithMemo(x + 1, y) + dfsWithMemo(x, y + 1);
        return dp[x][y];
    }

    public int findAllPathWithDP(int tx, int ty) {
        this.dp[0][0] = 1;

        for (int i = 0; i <= tx; i++) {
            for (int j = 0; j <= ty; j++) {
                if (i != 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                if (j != 0) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        for (int i = 0; i <= tx; i++) {
            for (int j = 0; j < ty; j++) {
                System.out.print(this.dp[i][j] + "\t");
            }
            System.out.println();
        }

        return this.dp[tx][ty];
    }
}
