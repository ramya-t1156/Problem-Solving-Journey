class Solution {
    int mod = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int ans = 0;
        int[] dp = new int[26+t];
        for(int i = 0;i<26;i++){
            dp[i] = 1;
        }
        // dp[i - 26] + dp[i - 25]   // "z" → "a" + "b" after one more transformation
        for(int i = 26;i<26+t;i++){
            dp[i] = (dp[i-26]+dp[i-25])%mod;
        }
        for(char ch : s.toCharArray()){
            ans = (ans+dp[ch-'a'+t])%mod;
        }
        return ans;
    }
}
