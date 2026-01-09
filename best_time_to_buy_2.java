class Solution {
    public int maxProfit(int[] prices) {
     int n=prices.length;
     int gain;
     int finalgain=0;
     for(int i=0;i<n-1;i++){
        gain=prices[i+1]-prices[i];
        if (gain>=0){
            finalgain+=gain;
        }
     }  
     return finalgain; 
    }
}
public class best_time_to_buy_2 {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] prices={7,1,5,3,6,4};
        int result=sol.maxProfit(prices);
        System.out.println("Maximum Profit : "+result);
        System.out.println("test case 2:");
        int[] prices2={7,6,4,3,1};
        int result2=sol.maxProfit(prices2);
        System.out.println("Maximum Profit : "+result2);
        System.out.println("test case 3:" );
        int[] prices3={2,4,1};
        int result3=sol.maxProfit(prices3);
        System.out.println("Maximum Profit : "+result3);
        System.out.println("test case 4:");
        int[] prices4={2,1,2,1,0,1,2};
        int result4=sol.maxProfit(prices4);
        System.out.println("Maximum Profit : "+result4);
    }
}
