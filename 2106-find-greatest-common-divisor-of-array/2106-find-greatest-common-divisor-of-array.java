class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // if(nums[n-1]%nums[0] == 0) return nums[0];
       // else {
            int max =1;
            int val=0;
            for(int i=2;i<=nums[n-1];i++){
                if(nums[0]%i==0 && nums[n-1]%i==0){
                     val=i;
                    if(max<val) max=val;
                }
            }
            return max;
        //}
    }
}