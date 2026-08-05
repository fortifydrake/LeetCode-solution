import java.util.*;
public class leetcode3703{
    public static String removeSubstring2(String s, int k){
        List<int[]> st = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(!st.isEmpty()&&st.get(st.size()-1)[0]==c){
                st.get(st.size()-1)[1] = st.get(st.size()-1)[1] +1;
            }
            else{
                st.add(new int[]{c, 1});
            }

            if(c==')'&&st.size()>=2){
                int close = st.get(st.size()-1)[1];
                int open = st.get(st.size()-2)[1];

                if(open>=k&&close>=k){
                    st.remove(st.size()-1);
                    open-=k;
                    if(open>0){
                        st.get(st.size()-1)[1] = open;
                    }
                    else{
                        st.remove(st.size()-1);
                    }
                }

            }
        }

        StringBuilder sb = new StringBuilder();

        for(int[] p : st){
            for(int j = 0;j<p[1];j++){
                sb.append((char)p[0]);
            }
        }

        return sb.toString();

    }
    public static String removeSubstring(String s, int k){
        Stack<Character> charst = new Stack<>();
        Stack<Integer> countst = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(!charst.isEmpty()&&charst.peek()==c){
                countst.push(countst.pop()+1);
            }
            else{
                charst.push(c);
                countst.push(1);
            }

            if(charst.peek()==')'&&charst.size()>=2){
                int close = countst.pop();
                int open = countst.pop();
                if(open>=k&&close>=k){
                    charst.pop();
                    charst.pop();
                    open-=k;
                    if(open>0){
                        charst.push('(');
                        countst.push(open);
                    }
                }
                else{
                    countst.push(open);
                    countst.push(close);
                }
            }

        } 

        StringBuilder sb = new StringBuilder();

        while(!charst.isEmpty()){
            char c = charst.pop();
            int count = countst.pop();
            for(int i = 0;i<count;i++){
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String s = "((()))()()()";
        int k = 3;
        s = removeSubstring(s, k);
        System.out.println(s);
        s = removeSubstring2(s, k);
        System.out.println(s);
    } 
}