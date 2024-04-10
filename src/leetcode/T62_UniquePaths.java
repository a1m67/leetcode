package leetcode;

public class T62_UniquePaths {
    public static int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=1;
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.println(uniquePaths(m,n));
    }
}
