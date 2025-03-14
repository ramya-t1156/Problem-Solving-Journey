class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1 , h = candies[0];
        for(int n : candies){
            if(n>h) h = n;
        }
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            long children = 0;
            for(int n : candies){
                children += n/mid;
            }
            // more children - less candy
            // less children - more candy
            if(children>=k){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }
}
