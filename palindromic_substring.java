public class palindromic_substring {
    public static void main(String[] args){
        String s="c";
        int n=s.length();
        int i=0;
        if(n%2!=0){
            int m=n/2;
            while(i<=m){
                if(s.charAt(m-i)==s.charAt(m+i)){
                    i++;
                }
                else{
                    break;
                }
            }
            String palindrome=s.substring(m-i+1,m+i);
            System.out.println(palindrome);
        }
        else{
            int m=n/2;
            while(i<m){
                if(s.charAt(m-i-1)==s.charAt(m+i)){
                    i++;
                }
                else{
                    break;
                }
            }
            String palindrome=s.substring(m-i,m+i);
            System.out.println(palindrome);
        }
    }
}
