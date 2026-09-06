public class leetcode3876{

    public static boolean uniformArray(int[] nums){
        int min = nums[0];
        boolean odd = false;
        for(int num: nums){
            min = Math.min(min, num);
            if(num%2!=0){
                odd = true;
            }
        }
        if(min%2!=0) return true;
        if(odd) return false;
        return true;

    }
    public static void main(String[] args){
        int[] nums = {2,3,13,34};
        System.out.println(uniformArray(nums));
    }
}