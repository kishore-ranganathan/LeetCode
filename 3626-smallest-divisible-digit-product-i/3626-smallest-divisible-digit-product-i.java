class Solution {
    public int smallestNumber(int n, int t) {
        int j=1;
        int z;
        for(int i=n;i<=100;i++){
            z=i;
            while(z>0){
                j=j*(z%10);
                z=z/10;
            }
            if(j%t==0) return i;
            j=1;
        }
    return 0;
    }
}
