class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int n = grid.length;
        int[] temp = new int[n*n+1];
        Arrays.fill(temp,0);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                temp[grid[i][j]]++;
            }
        }
        for(int i = 0;i<temp.length;i++){
            if(temp[i]>1){
                res[0] = i;
            }
            else if(temp[i]==0){
                res[1] = i;
            }
        }
        return res;
    }
}
