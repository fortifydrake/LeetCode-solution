class Secrett{
    public int Solve(int n,int result,int delay,int forget){
        if(n==1) return 1;
        else{
            for(int d=(n-forget+1);d<(n-delay);d++){
                result=result+Solve(d,result,delay,forget);
            }
        } 
        return result;
    }
}
public class Secret {
    
    public static void main(String[] args){
        Secrett s=new Secrett();
        int delay=2;
        int n=6;
        int forget=4;
        int result=0;
        System.out.println("result :"+s.Solve(n,result,delay,forget));
    }
}
