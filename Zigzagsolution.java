class Zigzagsolution2 {
    //"DONE"input, String str="PAYPALISHIRING", int numRows=3 output="PAHNAPLSIIGYIR"
    //"DONE"input, String str="PAYPALISHIRING", int numRows=4 output="PINALSIGYAHRPI"
    //'DONE'iinput, String str="MYNAMEISADITYAPRASADFROMSMIT",int numRows=3 output="MMAYAFSYAESDTARSDRMMTNIIPAOI"
    public String convert(String s, int numRows) {
        int r=numRows;
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        if(r==1) return s;
        if(r>=len) return s;
        int circle=2*numRows-2;
        int n=s.length();
        //System.out.println("circle :"+circle+"\nno. of rounds :"+((n/r)));
        for(int i=0;i<numRows&&sb.length()<=n;i++){
            int skip1=circle-2*i;
            int skip2=circle-skip1;
            int j=i;
            sb.append(s.charAt(j));
            if(i==0||i==numRows-1){
                int k=0;
                while(k<(n/r)&&j+circle<n){
                    k++;
                    j+=circle;
                    sb.append(s.charAt(j));
                }
            }
            else{
                int k=0;
                //System.out.println("hello");
                while(k<n/r-1&&j+skip1<n){
                    k++;
                    j=skip1+j;
                    //System.out.println(skip1);
                    sb.append(s.charAt(j));
                    //System.out.println(s.charAt(j));
                    if(j+skip2<n){
                        j+=skip2;
                        sb.append(s.charAt(j));
                        //System.out.println(s.charAt(j));
                    }
                }
            }
        }
        return sb.toString();
    }
}
public class Zigzagsolution{
    public static void main(String[] args){
        String s="PAYPALISHIRING";
        int r=3;
        Zigzagsolution2 zig=new Zigzagsolution2();
        String sb=zig.convert(s,r);
        System.out.println("\n"+sb+"\n");
        sb=zig.convert("MYNAMEISADITYAPRASADFROMSMIT",r);
        System.out.println("\n"+sb+"\n");

    }
}
