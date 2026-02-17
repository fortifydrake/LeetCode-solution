class Solution{
    public void setZeroes(int[][] matrix){
        int firstcol=0;
        int firstrow=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstcol=1; 
                break;
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstrow=1; 
                break;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstcol==1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

        if(firstrow==1){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
    }

}
public class setmatrixzero {
    public static void main(String[] args){
        Solution sol=new Solution();
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        sol.setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
