package day04;

class Number36_Solution2{
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] sub = new int[3][3][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.'){
                    continue;
                }
                int index = board[i][j] - '0' - 1;
                rows[i][index]++;
                columns[j][index]++;
                sub[i / 3][j / 3][index]++;
                if(rows[i][index] > 1 || columns[j][index] > 1 || sub[i / 3][j / 3][index] > 1){
                    return false;
                }
            }
        }
        return true;
    }
}
