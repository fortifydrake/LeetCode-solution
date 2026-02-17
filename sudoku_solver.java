class Solution {

    boolean isafe(char[][] board,int row,int col,char dig){
        //vertical
        for(int i=0;i<9;i++){
            if(board[i][col]==dig){
                return false;
            }
        }

        //horizontal
        for(int i=0;i<9;i++){
            if(board[row][i]==dig){
                return false;
            }
        }

        //grid
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j]==dig){
                    return false;
                }
            }
        }

        return true;
    }
    boolean helper(char[][] board,int row,int col){
        if(row==9) return true;

        // if not '.'

        int nrow=row,ncol=col+1;
        if(ncol==9){
            ncol=0;
            nrow=row+1;
        }
        if(board[row][col]!='.'){
            return helper(board,nrow,ncol);
        }

        //if '.'
        else if(board[row][col]=='.'){
            for(char dig='1';dig<='9';dig++){
                if(isafe(board,row,col,dig)){
                    board[row][col]=dig;
                    if(helper(board,nrow,ncol))return true;
                    board[row][col]='.';
                }
            }
        }

        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);        
    }
}
public class sudoku_solver {
    public static void main(String[] args){
        Solution s=new Solution();
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        s.solveSudoku(board);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
