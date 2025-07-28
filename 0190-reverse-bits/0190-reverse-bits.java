public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev=0;
        for(int i=1;i<=32;i++){
            rev<<=1;
            rev=rev | (1&n); 
            n=n>>1;
        }
        return rev;
    }
}