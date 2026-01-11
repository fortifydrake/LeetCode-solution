class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0) return;
        int insertPos=0;
        for(int num:nums){
            if(num!=0){
                nums[insertPos]=num;
                insertPos++;
            }
        }
        while(insertPos<nums.length){
            nums[insertPos]=0;
            insertPos++;
        }
    }
    public void moveZeroes2(int[] nums) {
        if(nums.length==1) return ;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                swap(nums,i,n-1);
                n--;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums,int i,int j){
            for(int k=i;k<j;k++){
                nums[k]=nums[k+1];
            }
            nums[j]=0;
        }
}
public class move_zeroes {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] nums={0,1,0,3,12};
        sol.moveZeroes(nums);
        System.out.print("Array after moving zeroes: ");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("test case 2:");
        int[] nums2={0};
        sol.moveZeroes(nums2);
        System.out.print("Array after moving zeroes: ");
        for(int num:nums2){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("test case 3:");
        int[] nums3={1,2,3,4,5};
        sol.moveZeroes(nums3);
        System.out.print("Array after moving zeroes: ");
        for(int num:nums3){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("test case 4:");
        int[] nums4={0,0,1,0};
        sol.moveZeroes(nums4);
        System.out.print("Array after moving zeroes: ");
        for(int num:nums4){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
/*Move Zeroes*/