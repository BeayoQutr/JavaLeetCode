package day04;

public class Number36_Solution1 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9'){
                    if(!isEffective(i, j, board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isEffective(int i, int j, char[][] board){
        //检查行
        for (int k = 0; k < board[i].length; k++) {
            if (board[i][k] == board[i][j] && k != j){
                return false;
            }
        }
        //检查列
        for (int k = 0; k < board.length; k++) {
            if (board[k][j] == board[i][j] && k != i){
                return false;
            }
        }
        //检查3*3的宫格
        int row = (i / 3) * 3;
        int column = (j / 3) * 3;
        for (int k = row; k < row + 3; k++) {
            for (int l = column; l < column + 3; l++) {
                if ((board[k][l] == board[i][j] && (k != i || l != j))){
                    return false;
                }
            }
        }
        return true;
    }
}
