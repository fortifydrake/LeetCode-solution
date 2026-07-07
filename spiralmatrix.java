import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    static int[][] move = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };

    public static void helper(int[][] matrix, int r, int c, List<Integer> result, boolean[][] visited, int lastmove){
        int i = 0;
        while(i<4){
            i++;
            int nr = r, nc = c;
            int[] m = move[lastmove];
            nr+=m[0];
            nc+=m[1];

            if(nr>=matrix.length||nc>=matrix[0].length){
                lastmove = (lastmove+1)%4;
                continue;
            }

            if(nr<0||nc<0){
                lastmove = (lastmove+1)%4;
                continue;
            }

            if(visited[nr][nc] == true){
                lastmove = (lastmove+1)%4;
                continue;
            }
            
            result.add(matrix[nr][nc]);
            visited[nr][nc] = true;
            helper(matrix, nr, nc, result, visited, lastmove);
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        result.add(matrix[0][0]);
        visited[0][0] = true;
        helper(matrix, 0, 0, result, visited, 0);
        System.out.println(result);
    }
}
