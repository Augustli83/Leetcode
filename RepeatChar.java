public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sub = new char[26];
        int[] num = new int[26];
        int i=0;
        int b=0;
        boolean flag=false;
        while(true){
            int times = 0;
            while(true){
                for(int a=0;a<times;a++){
                    if(s.charAt(i)==sub[a]){
                        flag=true;
                        
                        break;
                    }
                }
                if(flag){
                    i++;
                    break;
                }
                sub[times]=s.charAt(i);
                times++;
                i++;
                if(i>=s.length()-1)
                break;
            }
            num[b]=times;
            b++;
            if(i>=s.length()-1)
                break;
        }
        int maxLen=num[0];
        for(int d=0;d<b;d++){
            maxLen=comp(maxLen,num[d]);
        }
        return maxLen;
        
    }
    public int comp(int num1,int num2){
        if(num1>=num2)
            return num1;
        else
            return num2;
    }
}