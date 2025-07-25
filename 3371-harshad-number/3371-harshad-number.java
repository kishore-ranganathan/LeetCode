class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int d=0;
        int t=x;
        while(x!=0){
             d+=x%10;
            x/=10;
        }
        if(t%d==0){
            return d;
        }
        else{
            return -1;
        }
    }
}