class Solution{
    public int GasStation(int[] gas, int[] cost){
        int tank=0, total=0, start=0;

        for(int i=0;i<gas.length;i++){
            int diff = gas[i]-cost[i];
            tank+=diff;
            total+=diff;
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }

        return total>=0?start:-1;
    }
}

public class GasStation{
    public static void main(String[] args){
        int cost[] = {3,4,5,1,2};
        int gas[] = {1,2,3,4,5};
        Solution sol = new Solution();
        int result = sol.GasStation(gas, cost);
        System.out.println(result);
    }
}