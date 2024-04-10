package final_lc;

public class T59_GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        if (n == 1) {
//            int [][]result = {{1}};
            return new int[][]{{1}};
        }
        int[][] result = new int[n][n];
        int i = 0, j = 0, count = 1;
        int loop = n / 2;
        int loopCount = 0;
        while (loopCount < loop) {
            for (j = loopCount; j < n - loopCount - 1; j++) {
                result[loopCount][j] = count++;
            }
            for (i = loopCount; i < n - loopCount - 1; i++) {
                result[i][n - loopCount - 1] = count++;
            }
            for (i = n - loopCount - 1; i > loopCount; i--) {
                result[n-loopCount - 1][i] = count++;
            }
            for (i = n - loopCount - 1; i > loopCount; i--) {
                result[i][loopCount] = count ++;
            }
            loopCount++;
        }
        if (n % 2 == 1) {
            result[n/2][n/2] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(3));
    }
}
