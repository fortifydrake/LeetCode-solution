public class leetcode152{ 
    public static int maxProduct(int[] nums) {
        int localMax = 1, localMin = 1, globalMax = Integer.MIN_VALUE;
        for(int n : nums){
            globalMax = Math.max(globalMax, n);
        }
        for(int n:nums){
            int temp = localMax;
            localMax = Math.max(Math.max(localMax*n, localMin*n), n);
            localMin = Math.min(Math.min(temp*n, localMin*n), n);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        int res = maxProduct(nums);
        System.out.println(res);
    }
}