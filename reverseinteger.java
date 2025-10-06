class reversint{
    public int rev(int x){
        int output=0;
        if(x/10==0) return x;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            if(output>Integer.MAX_VALUE/10 || output==Integer.MAX_VALUE/10&&pop>7) return 0;
            if(output<Integer.MIN_VALUE/10 || output==Integer.MIN_VALUE/10&&pop>-8) return 0;
            output=output*10+pop;
            System.out.println(output);
            //if(output>Integer.MAX_VALUE || output<Integer.MIN_VALUE) return 0;
        }
        //if(output>Integer.MAX_VALUE || output<Integer.MIN_VALUE) return 0;
        return output;
    }
}
public class reverseinteger {
    public static void main(String[] args){
        reversint r=new reversint();
        int x=-123;
        int y=r.rev(x);
        System.out.println("y :"+y);// Output y :-321
        int x1=120;
        int y1=r.rev(x1);
        System.out.println("y1 :"+y1);// Output y1 :21
        int x2=1534236469;
        int y2=r.rev(x2);   
        System.out.println("y2 :"+y2);// Output y2 :0
        System.out.println(Integer.MAX_VALUE);
    }
}
