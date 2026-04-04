import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[k];
        for(int n:nums){
            map.put(n,1+map.getOrDefault(n,0));
            
        }
        //System.out.println(map);
        List<List<Integer>> list =new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            list.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            list.get(freq).add(num);
        }
        int idx=0;
        for(int i=nums.length;i>=0&&idx<k;i--){
            for (int num : list.get(i)) {
                res[idx++] = num;
                if (idx >= k) break;
            }
        }

        return res;
    }
}
public class topKelement {
    public static void main(String[] args){
        int[] nums={1,1,1,2,2,3};
        int k=2;
        Solution var1 = new Solution();
        int[] var2 = var1.topKFrequent(nums,k);
        for(int i:var2){
            System.out.print(i+" ");
        }
    }
}