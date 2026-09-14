public class leetcode836{

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int x3 = rec2[0], y3 = rec2[1], x4 = rec2[2], y4 = rec2[3];

        return Math.max(x1,x3)<Math.min(x2,x4) && Math.max(y1,y3)<Math.min(y2,y4);
    }
    public static void main(String[] args){
        int[] rec1 = {7,8,13,15};
        int[] rec2 = {10,8,12,20};
        System.out.println(isRectangleOverlap(rec1, rec2));
    }
}