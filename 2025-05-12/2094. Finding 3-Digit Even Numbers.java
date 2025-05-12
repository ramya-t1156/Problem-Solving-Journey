class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> temp = new HashSet<>();
        int[] freq = new int[10];
        for(int n:digits) freq[n]++;

        // not leading 0
        for(int i = 1;i<=9;i++){
            if(freq[i]==0) continue;
            freq[i]--;
            for(int j = 0;j<=9;j++){
                if(freq[j]==0) continue;
                freq[j]--;
                // only even numbers
                for(int k = 0;k<=8;k+=2){
                    if(freq[k]==0) continue;
                    temp.add(i*100+j*10+k);
                }
                freq[j]++;
            }
            freq[i]++;
        }
        int n = temp.size();
        ArrayList<Integer> temp2 = new ArrayList<>(temp);
        Collections.sort(temp2);
        
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            res[i] = temp2.get(i);
        }
        return res;
    } 
}
