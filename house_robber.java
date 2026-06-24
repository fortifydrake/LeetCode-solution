class Solution {
    private int rober(int[] nums) {
        if(nums.length<2) return nums[0];
        int total_loot[] = new int[nums.length];
        total_loot[0] = nums[0];
        total_loot[1] = Math.max(nums[1], nums[0]);
        for(int i=2;i<nums.length;i++){
            total_loot[i] = Math.max(total_loot[i-2] + nums[i], total_loot[i-1]);
        }
        return total_loot[nums.length-1];
    }
    public int rob(int[] nums) {
        int[] skiplast = new int[nums.length-1];
        int[] skipfirst = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            skipfirst[i] = nums[i+1];
            skiplast[i] = nums[i]; 
        } 
        int skiplastloot = rober(skiplast);
        int skipfirstloot = rober(skipfirst);

        return Math.max(skiplastloot,skipfirstloot);
    }
}
public class house_robber{
    public static void main(String[] args){
        int[] nums = {2,1,1,4};
        Solution sol = new Solution();
        int loot = sol.rob(nums);
        System.out.print(loot);
    }
}