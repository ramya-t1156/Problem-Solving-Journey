class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for(int n :nums){
            if(temp.contains(n)){
                temp.remove(n);
            }
            else{
                temp.add(n);
            }
        }
        return temp.size()==0;
    }
}
