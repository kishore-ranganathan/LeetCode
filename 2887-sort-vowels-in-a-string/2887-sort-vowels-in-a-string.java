class Solution {
    public String sortVowels(String s) {
        int len = s.length();
        char ch[] = new char[len];
        String vow_che = "aeiouAEIOU";
        List<Character> vow = new ArrayList<>();
        for(int i = 0 ; i < len ; i++) {
            char c = s.charAt(i);
            if(vow_che.contains(c+"")) {
                ch[i] = '0';
                vow.add(c);
            }
            else ch[i] = c;
        }
        Collections.sort(vow);
        int vow_ind = 0;
        for(int i = 0 ; i < len ; i++) {
            if(ch[i] == '0') ch[i] = vow.get(vow_ind++);
        }
        return String.valueOf(ch);
    }
}