class Solution {
public:
    vector<int> closestPrimes(int left, int right) {
        int limit = right+1;
        vector<bool>isPrime(limit,true);
        isPrime[0]=isPrime[1]=false;
        for(int i = 2;i*i<=limit;i++){
            if(isPrime[i]){
                for(int j = 2;i*j<=limit;j++){
                    isPrime[i*j] = false;
                }
            }
        }
        vector<int>primes;
        for(int i = max(2,left);i<=right;i++){
            if(isPrime[i]){
                primes.push_back(i);
            }
        }
        if(primes.size()<2){
            return {-1,-1};
        }
        int min_diff = INT_MAX , n1 = -1,n2 = -1;
        for(int i = 1;i<primes.size();i++){
            if(primes[i]-primes[i-1]<min_diff){
                min_diff = primes[i]-primes[i-1];
                n1 = primes[i-1];
                n2 = primes[i];
            }
        }
        return {n1,n2};
    }
};
