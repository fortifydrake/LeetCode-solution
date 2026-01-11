class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}

public class waterfill {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int result=sol.trap(height);
        System.out.println("Water trapped: "+result);
        System.out.println("test case 2:");
        int[] height2={4,2,0,3,2,5};
        int result2=sol.trap(height2);
        System.out.println("Water trapped: "+result2);
        System.out.println("test case 3:");
        int[] height3={1,0,2,1,0,1,3};
        int result3=sol.trap(height3);
        System.out.println("Water trapped: "+result3);
    }
}
