class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       
        while(k-- !=0){
            int max = nums[0];
             int ind = 0;
            for(int i=1;i<nums.length;i++){
                if(max > nums[i]) {
                    max = nums[i];
                    ind = i;
                } 
            }
            nums[ind] = max*multiplier;
        }
        return nums;
    }
}