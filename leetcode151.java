public class leetcode151 {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        s = s.trim();
        String[] li= s.split("\\s+");
        for(int i=li.length-1;i>=0;i--){
            //System.out.println(li[i]);
            //if(li[i]=="") continue;
            if(i>0){
                result.append(li[i]).append(" ");
                continue;
            }
            result.append(li[i]);
        }
        if(result.charAt(result.length()-1)==' ') result.setLength(result.length()-1);
        return result.toString();
    }
    public static String reverseWords2(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;
        int j = i+1;
        while(i>=0&&s.charAt(i)==' '){
            j--;
            i--;
        }
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' ') i--;
            result.append(s.substring(i+1,j)).append(" ");
            while(i>=0&&s.charAt(i)==' ') i--;
            j = i+1;
        }
        if(result.length()>0) result.setLength(result.length()-1);
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "  hello world!  ";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }
}
