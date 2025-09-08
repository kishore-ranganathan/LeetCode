class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        
        int arr_l[] = new int[ n];

        int arr_r[] = new int[n];

        arr_l[0] = 0;

        for( int i = 1 ; i < n ; i ++ ) {

            arr_l[i] = nums[i-1] + arr_l[i-1];

        }

        arr_r[n-1] = 0;

        for( int i = n-2 ; i >= 0 ; i -- ) {

            arr_r[i] = nums[i+1] + arr_r[i+1];

        }

        for( int i = 0 ; i < n ; i ++ ) nums[i] = Math.abs( arr_r[i] - arr_l[i]);

        return nums;
    }
}