import java.util.PriorityQueue;
import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int num:nums){
            p.offer(num);
            if(p.size()>k) p.poll();
        }
        return p.peek();
    }

    public int findKthLargest2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
public class largestkelement{
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        Solution sol = new Solution();
        int kthLargest = sol.findKthLargest(nums, k);
        int kthLargest2 = sol.findKthLargest2(nums, k);
        System.out.println("The " + k + "th largest element (using heapsort) is: " + kthLargest);
        System.out.println("The " + k + "th largest element (using sorting) is: " + kthLargest2);
    }
}