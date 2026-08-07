import java.util.ArrayList;
import java.util.List;

public class leetcode131{
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //metthod 1
    public static List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<>();
        for(int i=n;i>=1;i--){
            List<List<String>> comb = comb(s, i);
            result.addAll(comb);
        }    
        return result;
    }
    public static List<List<String>> comb(String s, int parts) {
        List<List<String>> result = new ArrayList<>();
        if (parts == 1) {
            
            if (isPalindrome(s)) {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                result.add(temp);
            }

            return result;
        }

        if(parts>s.length()){
            return result;
        }
        
        for (int j = 1; j < s.length(); j++) {
            String prefix = s.substring(0, j);

            if (!isPalindrome(prefix)) {
                continue;
            }

            List<List<String>> suffix = comb(s.substring(j), parts - 1);

            for (List<String> list : suffix) {
                List<String> temp = new ArrayList<>();
                temp.add(prefix);
                temp.addAll(list);
                result.add(temp);
            }
        }
        return result;
    }

    //metthod 2
    static boolean[][] isPalindrome;
    static String[][] substring;
    static List<List<String>> result;

    public static List<List<String>> partition2(String s) {
        isPalindrome = new boolean[s.length()][s.length()+1];
        substring = new String[s.length()][s.length()+1];

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    isPalindrome[i][j] = true;
                    substring[i][j] = s.substring(i,j);
                }
            }
        }
        result = new ArrayList<>();
        FindingSubstring(s, 0, new ArrayList<>());
        return result;
    }

    public static void FindingSubstring(String s, int start, List<String> current) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (isPalindrome[start][end]) {
                current.add(substring[start][end]);
                FindingSubstring(s, end, current);
                current.remove(current.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String s = "abacac";
        System.out.println(partition(s));
        System.out.println(partition2(s));
    }
}