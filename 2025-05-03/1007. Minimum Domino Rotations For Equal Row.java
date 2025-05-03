class Solution {
    public int tryRotationMatching(int num,int[] top,int[] bottom){
        int count = 0;
        for(int i = 0;i<top.length;i++){
            if(top[i]==num) continue;
            else if(bottom[i]==num) count++;
            else return Integer.MAX_VALUE;
        }
        return count;
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int minRotations = Integer.MAX_VALUE;
        for(int num = 1;num<=6;num++){
            int countTops = tryRotationMatching(num,tops,bottoms);
            int countBottoms = Integer.MAX_VALUE;
            if(countTops!=Integer.MAX_VALUE){
                countBottoms = tryRotationMatching(num,bottoms,tops);
            }
            minRotations = Math.min(minRotations,Math.min(countTops,countBottoms));
        }
        return minRotations==Integer.MAX_VALUE?-1:minRotations;
    }
}
