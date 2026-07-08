public class search2Dmatrix{

    public static boolean search(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0, end = m*n -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            int x = mid/n;
            int y = mid%n;

            if(matrix[x][y]==target) return true;
            else if(matrix[x][y]<target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; 
        int target = 3;
        System.out.println(search(matrix, target));
    }
}