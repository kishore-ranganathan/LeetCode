class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int a=min+k;
        int b=max-k;
        int c=b-a;
        if(c>0)return c;
        return 0;
    }
}