class Solution {
    public boolean divideArray(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length/2;
        // int count =0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //       int j=1+i;
        //     if(nums[i]==nums[j])
        //     {
        //         count++;
        //         j++;
        //         i++;
        //     }
        // }
        // if(count == n) return true;
        // else return false;
        // for(int i=0;i<nums.length;i+=2)
        // {
        //    if(nums[i]!=nums[i+1]) return false;
        // }
        // return true;
        int[] freq = new int[501];
        for(int i = 0; i<nums.length; i++) freq[nums[i]]++;
        for(int i = 0; i<501; i++){
            if(freq[i]%2 != 0) return false;
        }
        return true;
    }
}