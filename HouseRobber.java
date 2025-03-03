// Time Complexity : O(n)
// Space Complexity : O(n) where n = nums.length
// Did this code successfully run on Leetcode : Yes

public class HouseRobber {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];

        //  base
        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < dp.length; ++i) {
            // dont choose this house
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);

            // choose this house
            dp[i][1] = dp[i-1][0] + nums[i];
        }

        return Math.max(dp[dp.length - 1][0], dp[dp.length - 1][1]);
    }
}
