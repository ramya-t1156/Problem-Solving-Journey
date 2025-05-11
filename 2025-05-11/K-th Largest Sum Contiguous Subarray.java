class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum += arr[j];
                if(minHeap.size()<k){
                    minHeap.add(sum);
                }
                else if(sum>minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(sum);
                }
            }
        }
        return minHeap.peek();
    }
}
