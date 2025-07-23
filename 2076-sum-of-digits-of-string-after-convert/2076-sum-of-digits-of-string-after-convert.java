class Solution {
    public int getLucky(String s, int k) {
        int n=0;
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            n = s.charAt(i)-96;
            r+=n%10+n/10;
        }
        while(k>1){
        int add=0;
         while(r!=0){
         add+=r%10;
         r/=10;
         }
         k--;
         r=add;
        }
        return r;
    }
}