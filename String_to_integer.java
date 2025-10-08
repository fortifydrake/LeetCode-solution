class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Handle sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}

public class String_to_integer {
    public static void main (String[] args){
        Solution sol = new Solution();
        String s = "-99999999999";
        System.out.println("Converted integer: " + sol.myAtoi(s));
    }
}