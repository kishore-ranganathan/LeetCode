class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int k=0;k<nums.length-2;k++){
        if(nums[k]==0){
        for(int i=k;i<3+k;i++)
        {
            if(nums[i]==0) nums[i]=1;
            else nums[i]=0;
        }
        count++;
        }
        }
        if(nums[nums.length-1]==0 ||nums[nums.length-2]==0 ) return -1;
        else return count;
    }
}