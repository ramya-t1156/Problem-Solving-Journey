class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> temp = new ArrayList<>();
        int n = nums1.length , m = nums2.length;
        int i = 0 , j = 0;
        while(i<n && j<m){
            if(nums1[i][0]<nums2[j][0]){
                temp.add(nums1[i]);
                i++;
            }
            else if(nums2[j][0]<nums1[i][0]){
                temp.add(nums2[j]);
                j++;
            }
            else{
                temp.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
        }
        while(i<n){
            temp.add(nums1[i]);
            i++;
        }
        while(j<m){
            temp.add(nums2[j]);
            j++;
        }
        return temp.toArray(new int[temp.size()][]);
    }
}
