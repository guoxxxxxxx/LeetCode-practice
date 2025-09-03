package hot150;

/**
 * @Time: 2025/9/3 14:29
 * @Author: guo_x
 * @File: Exist_79
 * @Description:
 */
public class Exist_79 {

    public boolean exist(char[][] board, String word) {
        boolean result = false;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                int[][] visited = new int[board.length][board[0].length];
                visited[i][j] = 1;
                result = result || check(board, i, j, 0, word.toCharArray(), visited);
                if(result){
                    return result;
                }
                visited[i][j] = 0;
            }
        }
        return result;
    }

    public boolean check(char[][] board, int r, int c, int idx, char[] wordArray, int[][] visited){
        // base case
        if(idx == wordArray.length - 1 && board[r][c] == wordArray[idx]){
            return true;
        }
        if(board[r][c] != wordArray[idx]){
            visited[r][c] = 0;
            return false;
        }
        else{
            boolean flag = false;
            if(r - 1 >= 0 && visited[r-1][c] == 0){
                visited[r-1][c] = 1;
                flag = flag || check(board, r-1, c, idx+1, wordArray, visited);
            }
            if(r + 1 < board.length && visited[r+1][c] == 0){
                visited[r+1][c] = 1;
                flag = flag || check(board, r+1, c, idx+1, wordArray, visited);
            }
            if(c - 1 >= 0 && visited[r][c-1] == 0){
                visited[r][c-1] = 1;
                flag = flag || check(board, r, c-1, idx+1, wordArray, visited);
            }
            if(c + 1 < board[0].length && visited[r][c+1] == 0){
                visited[r][c+1] = 1;
                flag = flag || check(board, r, c+1, idx+1, wordArray, visited);
            }
            if(flag == false){
                visited[r][c] = 0;
                return false;
            }
            return flag;
        }
    }
}
