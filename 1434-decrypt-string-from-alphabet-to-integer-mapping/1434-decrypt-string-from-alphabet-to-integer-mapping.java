class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int len = s.length()-1;
        for(int i = len ; i >= 0 ; i--) {
            if(s.charAt(i) == '#') {
                int n1 = s.charAt((i-1))-'0';
                int n2 = s.charAt((i-2))-'0';
                ans.append((char)((((n2*10)+n1)-1)+'a'));
                i -= 2;
            }
            else {
                int num = s.charAt(i)-'0';
                num--;
                ans.append((char)(num+'a'));
            }
        }
        return ans.reverse().toString();
    }
}