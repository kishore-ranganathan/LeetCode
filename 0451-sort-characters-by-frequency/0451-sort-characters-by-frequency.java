class Solution {
    public String frequencySort(String s) {
        int frq[]=new int [128];
        char c[]=s.toCharArray();
        for(char ch:c)frq[ch]++;
        StringBuilder str= new StringBuilder();
        while(true)
        {
            int max=0;
            char maxchar=0;
            for(int i=0;i<128;i++)
            {
                if(frq[i]>max){
                max=frq[i];
                maxchar=(char)i;
                }
            }
            str.append(String.valueOf(maxchar).repeat(max));
            frq[maxchar]=0;
            if(max==0) break;
        }
        return str.toString();
    }
}