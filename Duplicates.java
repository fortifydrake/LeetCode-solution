
import java.util.Set;
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> copy=new HashSet<>();
        for(int num:nums){
            if(!copy.add(num)) return true;
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> copy=new HashSet<>();
        for(int num:nums){
            copy.add(num);
        }
        if(copy.size()<nums.length) return true;
        return false;
    }
}
public class Duplicates {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] nums={1,2,3,1};
        boolean result=sol.containsDuplicate(nums);
        boolean result_=sol.containsDuplicate2(nums);
        System.out.println("Contains duplicates: "+result+", "+result_);
        System.out.println("test case 2:");
        int[] nums2={1,2,3,4};
        boolean result2=sol.containsDuplicate(nums2);
        boolean result2_=sol.containsDuplicate2(nums2);
        System.out.println("Contains duplicates: "+result2+", "+result2_);
        System.out.println("test case 3:");
        int[] nums3={1,1,1,3,3,4,3,2,4,2};
        boolean result3=sol.containsDuplicate(nums3);
        boolean result3_=sol.containsDuplicate2(nums3);
        System.out.println("Contains duplicates: "+result3+", "+result3_);
    }
}
