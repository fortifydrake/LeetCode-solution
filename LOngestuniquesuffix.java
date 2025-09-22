import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> Unique =new HashSet<>();
        int MaxLength=0;
        int remover=0;
        for(int i=0;i<s.length();i++){
            if(!Unique.contains(s.charAt(i))){
                MaxLength=Math.max(MaxLength,i-remover+1);
            }
            else{
                while(Unique.contains(s.charAt(i))){
                    Unique.remove(s.charAt(remover));
                    remover++;
                }
            }
            Unique.add(s.charAt(i));
        }
        return MaxLength;
    }
}
public class LOngestuniquesuffix {
    
}
