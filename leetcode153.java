public class leetcode153 {
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(min, num);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
