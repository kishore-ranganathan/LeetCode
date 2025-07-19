class Solution {
    public String removeStars(String s) {
        Stack<Character> str = new Stack();
        for(char c : s.toCharArray()){
            if(c != '*') str.push(c);
            if(c == '*') {
                str.push(c);
                str.pop();
                str.pop();
            }

        }
        StringBuilder st = new StringBuilder();
        for(int i=0;i<str.size();i++){
            st.append(str.get(i));
        }
        return st.toString();
    }
}