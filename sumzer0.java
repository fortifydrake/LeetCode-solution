class Solution {
    public int[] sumZero(int n) {
       
       int[] arr=new int[n];
       for(int i=0;i<n/2;i++){
        
        arr[i]=i+1;
        arr[n-i-1]=-arr[i];
       }
       if(n%2!=0){
        arr[n/2]=0;
       }
       return arr;
    }
}
public class sumzer0 {
    public static void main(String[] args){
        Solution s=new Solution();
        int[] arr=s.sumZero(6);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
