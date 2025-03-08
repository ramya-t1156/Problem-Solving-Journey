class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0 , r = 0 , minBlocks = Integer.MAX_VALUE, curr = 0;
        while(r<blocks.length()){
            if(blocks.charAt(r)=='W'){
                curr++;
            }
            if(r-l+1==k){
                minBlocks = Math.min(minBlocks,curr);
                if(blocks.charAt(l)=='W') curr--;
                l++;
            }
            r++;
        }
        return minBlocks;
    }
}
