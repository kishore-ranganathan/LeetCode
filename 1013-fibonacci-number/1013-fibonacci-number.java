class Solution {
    public int fib(int n) {
        int sum=0;
        int f=0;
        int s=1;
        if(n==1){
            return 1;
        }
        else{
        for(int i=2;i<=n;i++)
        {
            sum=f+s;
            f=s;
            s=sum;
        }
        return sum;
        }
       // return 0;
    }
}