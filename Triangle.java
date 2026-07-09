import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Triangle{

    public static int minimumTotal(List<List<Integer>> triangle){
        int m = triangle.size();
        int[]dp = new int[m+1];
        
        for(int i = m-1;i>=0;i--){
            for(int j = 0;j<triangle.get(i).size();j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }

        return dp[0];
    }

    static int n;
    static Integer[][] dp;
    public static int minimumTotal2(List<List<Integer>> triangle){
        n = triangle.size(); 
        dp = new Integer[n][n];
        return dfs(triangle,0,0);
    }
    public static int dfs(List<List<Integer>> triangle, int i, int j){
        if(i==n-1) return triangle.get(i).get(j);
        if(dp[i][j]!=null) return dp[i][j];
        int down = dfs(triangle,i+1,j);
        int diag = dfs(triangle,i+1,j+1);
        return dp[i][j] = triangle.get(i).get(j) + Math.min(down, diag);
    }
    public static void main(String[] args){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));

        int total = minimumTotal2(triangle);
        System.out.println(total);
    }
}