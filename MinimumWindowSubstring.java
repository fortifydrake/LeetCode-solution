import java.util.HashMap;
import java.util.Map;
class Solution{

    public String Minimum(String s,String t){
        if(s.length()<t.length()||s.length()==0||t.length()==0){
            return "";
        }

        Map<Character,Integer> tmap=new HashMap<>();
        for(char c:t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> window=new HashMap<>();
        int left=0,match=0,n=tmap.size(),minLen=Integer.MAX_VALUE,start=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(tmap.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(tmap.get(c))){
                    match++;
                }
            }

            while(match==n){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char d=s.charAt(left);
                if(tmap.containsKey(d)){
                    window.put(d,window.get(d)-1);
                    if(window.get(d)<tmap.get(d)){
                        match--;
                    }                 
                }
                left++;
            }
        }

        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.Minimum(s, t);
        System.out.println("Minimum window substring: " + result);
    }
}