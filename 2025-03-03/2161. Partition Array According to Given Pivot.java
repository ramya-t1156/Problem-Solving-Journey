class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lesser = 0 , greater = 0 , equal = 0;
        int[] temp = new int[nums.length];

        for(int i = 0;i<nums.length ;i++){
            if(nums[i]>pivot){
                greater++;
            }
            else if(nums[i]<pivot){
                lesser++;
            }
            else{
                equal++;
            }
            temp[i] = nums[i];
            nums[i] = 0;
        }

        int less = 0 , eq = lesser , great = lesser+equal ;
        
        for(int i = 0;i<nums.length;i++){
            if(temp[i]<pivot && less<lesser){
                nums[less++] = temp[i];
            }
            else if(temp[i]>pivot && great<nums.length){
                nums[great++] = temp[i];
            }
            else{
                nums[eq++] = temp[i];
            }
        }
        
        return nums;
    }
}
