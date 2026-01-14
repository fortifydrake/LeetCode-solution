import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer, Integer> copy = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        Integer index=copy.put(nums[i],i);
        if(index!=null){
            if((i-index)<=k) return true;
        }
       } 
       return false;
    }
}
public class Duplicates2 {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] nums={1,2,3,1};
        int k=3;
        boolean result=sol.containsNearbyDuplicate(nums,k);
        System.out.println("Contains nearby duplicates: "+result);
        System.out.println("test case 2:");
        int[] nums2={1,0,1,1};
        int k2=1;
        boolean result2=sol.containsNearbyDuplicate(nums2,k2);
        System.out.println("Contains nearby duplicates: "+result2);
        System.out.println("test case 3:");
        int[] nums3={1,2,3,1,2,3};
        int k3=2;
        boolean result3=sol.containsNearbyDuplicate(nums3,k3);
        System.out.println("Contains nearby duplicates: "+result3);
    }
}
