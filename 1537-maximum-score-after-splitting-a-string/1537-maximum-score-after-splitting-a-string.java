class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zero = 0;
        if(s.charAt(0) == '0') zero = 1;
        else ones = -1;
        int len = s.length();
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '1') ones++;
        }
        int max = 0;
        for(int i = 1 ; i < s.length() ; i++) {
            int sum = ones + zero;
            if(sum > max) max = sum; 
            if(s.charAt(i) == '1') ones--;
            else zero++;
        }
        return max;
    }
}
