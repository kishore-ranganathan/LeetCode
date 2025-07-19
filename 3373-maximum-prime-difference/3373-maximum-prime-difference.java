class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int st = 0,end = 0;
        for(int i =0;i<nums.length;i++){
            if(isPrime(nums[i])){
                st=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(isPrime(nums[i])){
                end = i;
                break;
            }
        }
        return Math.abs(end-st);
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}