/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false
*/

class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char[] Stack=new char[n];
        int top=-1;
        if(n==1)return false;
        else if(s.charAt(n-1)=='('||s.charAt(n-1)=='['||s.charAt(n-1)=='{') return false;
        else if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;
        for (int i=0;i<n;i++){
            char current=s.charAt(i);
            if(current=='('||current=='['||current=='{'){
                Stack[++top]=current;
            }
            else if(current==')'||current==']'||current=='}'){
                if(top==-1) return false;
                else if(Stack[top]=='('&&current!=')')return false;
                else if(Stack[top]=='['&&current!=']')return false;
                else if(Stack[top]=='{'&&current!='}')return false;
                else {
                    top--;
                }
            }
        }
        if(top!=-1) return false;
        else return true;
    }
}
public class validParanthesis {
    
}
