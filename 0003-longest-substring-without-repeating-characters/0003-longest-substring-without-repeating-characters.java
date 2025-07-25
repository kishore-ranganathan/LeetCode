class Solution {
    public int lengthOfLongestSubstring(String s) {
          List<Character>list=new ArrayList<>();
        int st=0;int e=0;int max=0;
        while(e<s.length())
        {
            if(!list.contains(s.charAt(e)))
            {
                list.add(s.charAt(e));
                max=Math.max(max,list.size());
                e++;
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    }
}