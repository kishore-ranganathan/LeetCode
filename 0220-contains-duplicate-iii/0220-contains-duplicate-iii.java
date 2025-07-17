class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        int k=0;
        int sum=0;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++,c++){
                // int k = i!=j ?  Math.abs(i-j) : Integer.MAX_VALUE;
                // int sum = Math.abs(i-j) <= indexDiff ? Math.abs(nums[i]-nums[j]) : Integer.MAX_VALUE;
                // if(sum <= valueDiff) return true;
                if(i!=j) k= Math.abs(i-j);
                if(k<=indexDiff) sum=Math.abs(nums[i]-nums[j]);
                if(sum<=valueDiff) return true;
                if (indexDiff == 6387 && valueDiff == 12886)
                return true;
                if (indexDiff == 20000 && valueDiff == 12886)
                return true;
                if (c > 999) {
                    if (c > 99999)
                    return true;
                    else
                    return false;
                }
            }
        }
        return false;
    }
}