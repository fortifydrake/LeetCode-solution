public class leetcode2091 {
    public static int minimumDeletions(int[] nums) {
        int min = nums[0];
        int minind = 0;
        int max = nums[0];
        int maxind = 0;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                minind = i;
                min = nums[i];
            }
            if(max<nums[i]){
                maxind = i;
                max = nums[i];
            }
        }

        int a = Math.min(minind, maxind);
        int b = Math.max(minind, maxind);

        return Math.min((a+1)+(nums.length-b), Math.min(b+1, nums.length - a));
    }

    public static void main(String[] args){
        int[] nums = {0,-4,19,1,8,-2,-3,5};
        System.out.println(minimumDeletions(nums));
    }
}
