class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] values = new int[10001];
        for(int i:nums){
            values[i]+=i;
        }
        return houseRobb(values);
    }

    private int houseRobb(int[] values) {
        int[] dp = new int[values.length];
        dp[0] = values[0];
        dp[1] = Math.max(values[0], values[1]);

        for(int i = 2;i<values.length; i++){
            dp[i] = Math.max(values[i] + dp[i-2], dp[i-1]);
        }
        return dp[values.length-1];
    }
}