class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        if(x<0) return false;
        else{
        while(x!=0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        }
        if(temp==rev) return true;
        else return false;
    }
}