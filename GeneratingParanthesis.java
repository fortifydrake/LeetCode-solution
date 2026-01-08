/*Generate Parentheses
Companies
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 
no. of possibilities    :
                            Cn​=(1/(n+1))*(nC2)

Constraints:

1 <= n <= 8
*/

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<String>();
        gen(result,0,0,new StringBuilder(),n);
        return result;
    }
    public void gen(List<String> result,int left,int right,StringBuilder s,int n){
        if(s.length()==n*2){
            result.add(s.toString());
            return;
        }
        if(left<n){
            s.append("(");
            gen(result,left+1,right,s,n);
            s.deleteCharAt(s.length()-1);
        }
        if(right<left){
            s.append(")");
            gen(result,left,right+1,s,n);
            s.deleteCharAt(s.length()-1);
        }
    }
}

public class GeneratingParanthesis {
    public static void main(String[] args){
        Solution sol=new Solution();
        int n = 8;
        List<String> result = sol.generateParenthesis(n);

        System.out.println("Valid Parentheses for n = " + n + ":");
        int c=1;
        for (String s : result) {
            System.out.println(s+"  "+c);
            c++;
        }
    }
}
