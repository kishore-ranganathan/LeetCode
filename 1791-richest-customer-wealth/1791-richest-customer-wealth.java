class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int r=0;r<accounts.length;r++)
        {
            int add=0;
            for(int c=0;c<accounts[0].length;c++)
            {
                add+=accounts[r][c];
            }
            if(max<add) max=add;
        }
        return max;
    }
}