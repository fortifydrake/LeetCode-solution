import java.util.*;
class Solution {

    public boolean isOneDiff(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        return count==1;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet=new HashSet<>(wordList);
        if(!wordSet.contains(endWord)){
            return 0;
        }
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int count=1;
        while(!q.isEmpty()){
            //System.out.println(q);
            int size=q.size();
            for(int i=0;i<size;i++){
                //System.out.println(q);
                String word=q.poll();
                if(word.equals(endWord)){
                    return count;
                }
                char[] chars=word.toCharArray();
                for(int j=0;j<chars.length;j++){
                    //System.out.println(word);
                    char o=chars[j];
                    for(char c='a';c<='z';c++){
                        chars[j]=c;
                        String nword=new String(chars);
                        //System.out.println(nword+" "+word);
                        if(wordSet.contains(nword)){
                            //System.out.println(nword+" "+word+" "+count);
                            
                            q.add(nword);
                            wordSet.remove(nword);
                        }
                    }
                    chars[j]=o;
                }
            }
            count++;
        }
        return 0;
    }
}

public class wordLadder{
    public static void main(String[] args){
        Solution sol=new Solution();
        String beginWord="hot";
        String endWord="dot";
        List<String> wordList=Arrays.asList("hit","dot","dit");
        int result=sol.ladderLength(beginWord,endWord,wordList);
        System.out.println(result);
    }
}