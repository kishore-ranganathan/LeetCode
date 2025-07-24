class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=/*Integer.MIN_VALUE*/ 0;
        int ind=0;
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                // if(mat[i][j]==1)
                // {
                //  count++;
                // }
                count+=mat[i][j];
            }
            if(max<count)
            {
                max=count;
                ind=i;
            }
        }
        return new int[]{ind,max};
    }
}