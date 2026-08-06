//leetcode 3. Longest Substring Without Repeating Characters
import java.util.HashMap;
import java.util.Map;

public class longestuniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring2(s));
    }
    public static int lengthOfLongestSubstring2(String s) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c,right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        int[] index = new int[128];
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            left = Math.max(left, index[c]);
            index[c] = right + 1;
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}