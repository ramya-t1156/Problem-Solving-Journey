class Solution {
    public int minCapability(int[] nums, int k) {
        int l = 1 , h = Integer.MIN_VALUE;
        for(int n : nums){
            if(n>h) h = n;
        }
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(canRob(nums,k,mid)){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    public boolean canRob(int[] nums,int k,int cap){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<=cap){
                i++;
                count++;
            }
            if(count>=k) return true;
        }
        return false;
    }
}
