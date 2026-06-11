import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] temp = new int[10001];
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length-1;i>=0;i--){
            while(!(st.isEmpty())&&st.peek()<nums2[i]){
                st.pop();
            }
            temp[nums2[i]] = (st.isEmpty()) ? -1 : st.peek();
            st.push(nums2[i]);
        }

        for(int i =0 ;i<nums1.length;i++){
            nums1[i] = temp[nums1[i]];
        }
        
        return nums1;
    }
}
public class nextGreaterElement{
    public static void main(String[] args){
        int[] nums2 ={1,3,4,2};
        int[] nums1={4,1,2};

        Solution sol = new Solution();
        int[] result  = sol.nextGreaterElement(nums1, nums2);
        System.out.print("{");
        for(int i = 0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
        System.out.println(" }");
    }
}