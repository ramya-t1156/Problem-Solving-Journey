class Solution {
    public long coloredCells(int n) {
        long cell = 1;
        for(int i = 1 ; i < n ; i++){
            cell = cell + (4*i);
        }
        return cell;
    }
}
