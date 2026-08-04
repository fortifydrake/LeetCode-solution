public class leetcode80 {
    public static int removeDuplicates(int[] nums){
        if(nums.length<=2) return nums.length;
        int left = 2;
        int o = 0;
        for(int right=2; right<nums.length; right++){
            if(nums[right]!=nums[o]){
                nums[left] = nums[right];
                left++;
                o = left-2;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
        for(int i=0;i<res;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
