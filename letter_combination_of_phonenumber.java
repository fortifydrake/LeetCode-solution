import java.util.*;
class Solution {
    public List<String> letterCombinations(String digits) {
        //HashMap<Integer,String> digit=new HashMap<>();
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;

        String[] digit = new String[]{
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };
        
        backtrack(digits,result,digit,new StringBuilder(),0);
        return result;
    }

    private static void backtrack(String digits,List<String> result,String[] digit,StringBuilder current,int index){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }

        String letter=digit[digits.charAt(index)-'0'];
        for(char c:letter.toCharArray()){
           backtrack(digits,result,digit,current.append(c),index+1);
           current.deleteCharAt(current.length()-1);
        }
    }
}


public class letter_combination_of_phonenumber {
    public static void main (String[] args){
        Solution sol = new Solution();
        String digits = "23";
        System.out.println("Letter combinations: " + sol.letterCombinations(digits));
    }
}
