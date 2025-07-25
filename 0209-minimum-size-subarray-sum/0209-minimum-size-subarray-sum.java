class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0;
        int en=0;
        int add=0;
        int min=Integer.MAX_VALUE;
        for(en=0;en<nums.length;en++)
        {
            add+=nums[en];
            while(add>=target)
            {
                min=Math.min(min,en-st+1);
                add-=nums[st];
                st++;
            }
        }
        return min==Integer.MAX_VALUE ?  0:min;
    }
}