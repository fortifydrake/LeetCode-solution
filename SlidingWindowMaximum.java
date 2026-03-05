import java.util.*;
class Solution{
    public int[] maxSliding(int[] nums,int k){
       Deque<Integer> deque=new ArrayDeque<>();
       int[] result=new int[nums.length-k+1];
       int index=0;
       for(int i=0;i<nums.length;i++){

        if(!deque.isEmpty()&&deque.peek()==i-k){
            deque.pollFirst();
        }

        while(!deque.isEmpty()&&nums[deque.peekFirst()]<nums[i]){
            deque.pollFirst();
        }

        deque.offerLast(i);
        if(i>=k-1){
            result[index++]=nums[deque.peekFirst()];
        }
       }

       return result;
    }
}
public class SlidingWindowMaximum {
    public static void main(String[] args){
        Solution var1 = new Solution();
        System.out.println("test case 1:");
        int[] var2 = new int[]{1,3,-3,5,-1,5,6};
        int k=3;
        int[] var3 = var1.maxSliding(var2,k);
        for(int i=0;i<var2.length-k+1;i++){
            System.out.print(var3[i]+" ");
        }
        System.out.println("");
    }
}
