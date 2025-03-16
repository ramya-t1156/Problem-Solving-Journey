class Solution {
    public long repairCars(int[] ranks, int cars) {
        // The maximum possible time occurs when the best mechanic (minimum rank) repairs all cars alone.
        long l = 1 , r = (long) Arrays.stream(ranks).min().getAsInt()*cars*cars;
        
        while(l<=r){
            long mid = l+(r-l)/2;
            if(canRepairAll(ranks,cars,mid)){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }

    public boolean canRepairAll(int[] ranks , int cars , long time){
        long totalCarsRepaired = 0;
        for(int rank : ranks){
            totalCarsRepaired += Math.sqrt(time/rank);
            if(totalCarsRepaired>=cars) return true;
        }
        return false;
    }
}
