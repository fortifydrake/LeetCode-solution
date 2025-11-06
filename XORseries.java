class Solution {
    public int XOR(int x,int y){
            return x^y;
        }
    public int longestSubsequence(int[] nums) {
        int countmax=0;
        int count=0;
        int x=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            System.out.println(x+" "+nums[i]+" "+XOR(x,nums[i]));
            if(XOR(x,nums[i])!=0){
                count=i;
                x=XOR(x,nums[i]);
            }
            else{
                //count=0;
                x=XOR(x,nums[i]);
            }
            countmax=Math.max(countmax,count);
        }
        return countmax+1;
    }
}
public class XORseries {
    public static void main (String[] args){
        Solution sol = new Solution();
        int[] nums = {8,4,9,2};
        System.out.println("Longest subsequence length: " + sol.longestSubsequence(nums));
    }
}
