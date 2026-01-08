class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int[] profit = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            profit[i] = prices[i + 1] - prices[i];
        }

        int max = 0;
        int current = 0;
        for (int v : profit) {
            current = Math.max(0, current + v);
            max = Math.max(max, current);
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int profit = 0;
        int maxprofit = 0;
        int l = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[l] > prices[i]) l = i;
            if(prices[i] > prices[l]){
                profit = prices[i] - prices[l];
                maxprofit = Math.max(profit,maxprofit);
            }
            
        }   
        return maxprofit;
    }
}
public class best_time_to_buy {
    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println("test case 1:");
        int[] prices={7,1,5,3,6,4};
        int result=sol.maxProfit(prices);
        int result2=sol.maxProfit2(prices);
        System.out.println("Maximum Profit 1: "+result);
        System.out.println("Maximum Profit 2: "+result2);
        /*System.out.println("test case 2:");
        int[] prices2={7,6,4,3,1};
        int result2=sol.maxProfit(prices2);
        System.out.println("Maximum Profit: "+result2);
        System.out.println("test case 3:" );
        int[] prices3={2,4,1};
        int result3=sol.maxProfit(prices3);
        System.out.println("Maximum Profit: "+result3);
        System.out.println("test case 4:");
        int[] prices4={2,1,2,1,0,1,2};
        int result4=sol.maxProfit(prices4);
        System.out.println("Maximum Profit: "+result4);*/
    }
}/*
Best Time to Buy and Sell Stock
*/