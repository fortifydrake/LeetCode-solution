public class Leetcode115{
    public static int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        int[] prev = new int[n+1];
        prev[0] = 1;
        for(int i=1;i<=m;i++){
            for(int j=n;j>0;j--){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    prev[j] = prev[j-1] + prev[j];
                }
            }
        }

        return prev[n];
    }
    public static void main(String[] args){
        String s = "rabbbit";
        String t = "rabbit";
        int res = numDistinct(s, t);
        System.out.println(res);
    }
}