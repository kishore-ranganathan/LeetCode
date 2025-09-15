class Solution {
    public int canBeTypedWords(String text, String br) {
        int cou = 0;
        String []arr = text.split(" ");
        char []arr1 = br.toCharArray();
        for(String str : arr) {
            boolean fl = true;
            for(char ch : arr1) {
                if(str.contains(ch+"")) {
                    fl = false;
                    break;
                }
            }
            if(fl) cou++;
        }
        return cou;
    }
}