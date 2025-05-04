class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] countMap = new int[100];
        int result = 0;
        for(int[] temp : dominoes){
            int a = temp[0] , b = temp[1];
            int key = a>b?a*10+b:b*10+a;
            result += countMap[key];
            countMap[key]++;
        }
        return result;
    }
}
