import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use a HashMap to group strings by their sorted version
        Map<String, List<String>> map = new HashMap<>();

        for (int i=0;i<strs.length;i++) {
            // 1. Convert string to char array and sort it
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            
            // 2. Create the key from the sorted chars
            String key = new String(chars);

            // 3. If key isn't in map, add a new ArrayList
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 4. Add the original string to the corresponding list
            map.get(key).add(strs[i]);
        }

        // Return all the lists stored in the map values
        return new ArrayList<>(map.values());
    }
}public class AnagramMatching {
    public static void main(String[] args){
        Solution sol=new Solution();
        String[] words={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res=sol.groupAnagrams(words);
        for(List<String> list:res){
            System.out.println(list);
        }
    }
}
