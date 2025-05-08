class Solution {
    public int findMissing(int[] arr) {
        // code here
        int n = arr.length;
        int diff1 = arr[1]-arr[0];
        int diff2 = arr[n-1]-arr[n-2];
        int diff3 = (arr[n-1]-arr[0])/n;
        int diff;
        if(diff1==diff2){
            diff = diff1;
        }
        else if(diff1==diff3){
            diff = diff1;
        }
        else{
            diff = diff2;
        }
        // ex - if all are 5
        if(diff==0){
            return arr[0];
        }
        int currSum = 0;
        for(int num : arr) currSum += num;
        
        int requiredSum = (int)(((2L * arr[0] + (long) n * diff) * (n + 1)) / 2);
        
        return requiredSum-currSum;
    }
}
