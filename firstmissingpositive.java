class Solution{
    public int firstMissingPositive(int[] num){
        if(num.length==0) return 1;
        boolean[] present = new boolean[num.length+1];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>0 && num[i]<=num.length){
                present[num[i]]=true;
                min = Math.min(min,num[i]);
            }
        }

        if(min>1) return 1;
        for(int i=1;i<present.length;i++){
            if(!present[i]) return i;
        }

        return num.length+1;
    }
}


public class firstmissingpositive {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] num = {};
        System.out.println("First missing positive: " + sol.firstMissingPositive(num));
    }
}