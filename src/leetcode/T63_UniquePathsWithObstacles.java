package leetcode;

public class T63_UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0]==1)return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            if (obstacleGrid[i][0] == 0){
                dp[i][0] = 1;
            }
            else {
                dp[i][0] = 0;
                break;
            }
        }
        for (int i = 0; i < dp[0].length; i++) {
            if (obstacleGrid[0][i] == 0){
                dp[0][i] = 1;
            } else {
                dp[0][i] = 0;
                break;
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int [][]a = {{0, 0},{1,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(a));
    }
}
