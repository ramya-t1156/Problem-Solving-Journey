class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length()-1;
        while(num.charAt(n)=='0'){
            n--;
        }
        num = num.substring(0,n+1);
        return num;
    }
}
