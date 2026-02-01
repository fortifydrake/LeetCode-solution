import java.util.*;
class Solution{
    public List<Integer> findsubstring(String s,String[] word){
        List<Integer> result= new ArrayList<>();
        int length=word[0].length;
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<s.length();i+=length){
            String w=s[i:length+1];
            map.put(i,w);
        }
        
    }
}
public class Substring_with_concatenation_of_all_word {
    public static void main (String[] args){
        Solution sol=new Solution();
    }
}
