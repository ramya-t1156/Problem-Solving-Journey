class Solution {
    public String countAndSay(int n) {
        // code here 
        if(n==1) return "1";
        
        String res = "1";
        
        int count = 0;
        for(int i = 1;i<n;i++){
            StringBuilder curr = new StringBuilder();
            count = 1;
            for(int j = 1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    count++;
                }
                else{
                    curr.append(count).append(res.charAt(j-1));
                    count = 1;
                }
            }
            curr.append(count).append(res.charAt(res.length()-1));
            res = curr.toString();
        }
        return res;
    }
}
