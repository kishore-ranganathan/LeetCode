class Solution {
    public int maxFreqSum(String s) {
        int []lett = new int[26];
        int len = s.length();
        for(int i = 0 ; i < len ; i++) {
            lett[s.charAt(i) - 'a']++;
        }
        int vow = 0;
        int cons = 0;
        for(int i = 0 ; i < 26 ; i++) {
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                if(vow < lett[i]) vow = lett[i];
            }
            else {
                if(cons < lett[i]) {
                    cons = lett[i];
                }
            }
        }
        return vow + cons;
    }
}