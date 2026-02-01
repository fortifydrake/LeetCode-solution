import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'1';
                    int boxin=(i/3)*3+(j/3);

                    if(rows[i][num]||column[j][num]||box[boxin][num]) return false;
                    rows[i][num]=column[j][num]=box[boxin][num]=true;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]=new HashSet<Character>();
            columns[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    Character num=board[i][j];
                    int boxIndex=(i/3)*3+(j/3);
                    if(rows[i].contains(num)||columns[j].contains(num)||boxes[boxIndex].contains(num)){
                        return false;
                    }
                    rows[i].add(num);
                    columns[j].add(num);
                    boxes[boxIndex].add(num);
                }
            }
        }

        return true;
    }
}
public class sudoku {
    public static void main(String[] args){
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

        Solution solution=new Solution();
        boolean isValid=solution.isValidSudoku(board);
        System.out.println("The Sudoku board is valid: " + isValid);
        boolean isValid2=solution.isValidSudoku2(board);
        System.out.println("The Sudoku board is valid (method 2): " + isValid2);
    }
}
