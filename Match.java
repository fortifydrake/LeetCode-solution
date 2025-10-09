class Solution {
    public boolean isMatch(String s, String p) {
        int i=0,j=0,n=s.length(),m=p.length();
        char prev=p.charAt(i);
        if(p.isEmpty())return s.isEmpty();
        while(j+1<m&&p.charAt(j+1)=='*'){
            if(p.charAt(j)==s.charAt(i))i++;
            else j+=2;
        }
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
            i++;
            j++;
        }
        return isMatch(s.substring(i,n),p.substring(j,m));
    }
}
public class Match{
    public static void main(String[] args){
        Solution sol=new Solution();
        String s="aab";
        String p="c*a*b";//true

        System.out.println(sol.isMatch(s,p));
    }
}