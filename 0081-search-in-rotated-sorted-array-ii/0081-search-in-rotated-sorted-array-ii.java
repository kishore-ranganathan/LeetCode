class Solution {
    public boolean search(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                count++;
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}