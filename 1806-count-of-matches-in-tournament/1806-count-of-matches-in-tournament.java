class Solution {
    public int numberOfMatches(int n) {
        if(n==1) return 0;
        int sum  =1;
        while(n>2){
            if(n%2==0){
                n/=2;
                sum+=n;
            }
            else{
                n = (n-1)/2;
                //System.out.println(n);
                sum+=n;
                n+=1;
            }
        }
        return sum;
    }
}