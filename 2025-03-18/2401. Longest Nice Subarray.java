class Solution {
    public int longestNiceSubarray(int[] nums) {
        int curr_sum = 0;
        int max_len = 0;
        int xor_sum = 0;
        int l = 0 , r = 0;
        while(r<nums.length){
            curr_sum += nums[r];
            xor_sum ^= nums[r];
            while(curr_sum!=xor_sum){
                curr_sum -= nums[l];
                xor_sum ^= nums[l];
                l++;
            }
            max_len = Math.max(max_len,r-l+1);
            r++;
        }
        return max_len;
    }
}
