
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
         for (int k = 1; k <= 60; k++) { // 60 is enough since 2^60 > 1e18
            long target = (long) num1 - (long) k * num2;
            if (target < k) continue; 
            if (Long.bitCount(target) <= k) {
                return k;
            }
        }
        return -1;
    }
}

public class sum {

    public static void main(String[] args){
        int result=new Solution().makeTheIntegerZero(12,-55);
        System.out.println(result);
    }
}/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.*/