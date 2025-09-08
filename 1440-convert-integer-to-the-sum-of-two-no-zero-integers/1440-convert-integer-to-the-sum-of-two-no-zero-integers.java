class Solution {
    public int[] getNoZeroIntegers(int n) {
    
        for(int i = 1 ; i <= n / 2 ; i++) {
            if(non_zero(i) && non_zero(n-i)) return new int[] {i, n - i};
        }
        return new int[]{2, 4};
    }
        public boolean non_zero(int num) {
            while(num != 0) {
                if(num % 10 == 0) return false;
                num /= 10;
            }
            return true;
        }
}