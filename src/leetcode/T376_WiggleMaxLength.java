package leetcode;

public class T376_WiggleMaxLength {
    public static int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = nums[i] - nums[i - 1];
        }
        boolean isAllZero = true;
        int notEqualZero = 1;
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] != 0) {
                isAllZero = false;
                notEqualZero = i;
                break;
            }
        }
        if (isAllZero) return 1;
        int res = 2;
        if (nums.length == 1 || nums.length == 2) {
            return nums.length;
        }

        boolean isMinus = false;
        if (dp[notEqualZero] > 0) isMinus = true;
        for (int i = notEqualZero; i < dp.length - 1; i++) {
            if (isMinus) {
                if (dp[i + 1] < 0) {
                    isMinus = false;
                    res++;
                }
            } else {
                if (dp[i + 1] > 0) {
                    isMinus = true;
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1, 1, 7, 4, 9, 2, 5};
        System.out.println(wiggleMaxLength(num));
    }
}