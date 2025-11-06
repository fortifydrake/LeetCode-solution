class Zigzagsolution2 {
    //"DONE"input, String str="PAYPALISHIRING", int numRows=3 output="PAHNAPLSIIGYIR"
    //"DONE"input, String str="PAYPALISHIRING", int numRows=4 output="PINALSIGYAHRPI"
    //"DONE"input, String str="ABCD", int numRows=4 output="ABDC"
    //'DONE'iinput, String str="MYNAMEISADITYAPRASADFROMSMIT",int numRows=3 output="MMAYAFSYAESDTARSDRMMTNIIPAOI"
    public String convert(String s, int numRows) {
        int r=numRows;
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        if(r==1) return s;
        if(r>=len) return s;
        int circle=2*numRows-2;
        //int n=s.length();
        //System.out.println("circle :"+circle+"\nno. of rounds :"+((n/r)));
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += circle) {
                sb.append(s.charAt(j));
                // For middle rows, add the character in the zigzag diagonal
                int diagIdx = j + circle - 2 * i;
                if (i != 0 && i != numRows - 1 && diagIdx < s.length()) {
                    sb.append(s.charAt(diagIdx));
                }
            }
        }
        return sb.toString();
    }
}
public class Zigzagsolution{
    public static void main(String[] args){
        String s="ABCD";
        int r=3;
        Zigzagsolution2 zig=new Zigzagsolution2();
        String sb=zig.convert(s,r);
        System.out.println("\n"+sb+"\n");
        sb=zig.convert("PAYPALISHIRING",4);
        System.out.println("\n"+sb+"\n");

    }
}
