class Solution {
    private int rows;
    private int cols;
    private String targetWord;
    private char[][] gameBoard;
    public boolean exist(char[][] board, String word) {
        rows = board.length;      
        cols = board[0].length;   
        targetWord = word;       
        gameBoard = board;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int row, int col, int idx) {
        if (idx == targetWord.length() - 1) {
            return gameBoard[row][col] == targetWord.charAt(idx);
        }
        if (gameBoard[row][col] != targetWord.charAt(idx)) {
            return false;
        }
        char temp = gameBoard[row][col];
        gameBoard[row][col] = '0';
        int[] dir = {-1, 0, 1, 0, -1};
        for (int d = 0; d < 4; ++d) {
            int nr = row + dir[d];
            int nc = col + dir[d + 1];
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && gameBoard[nr][nc] != '0') {
                if (dfs(nr, nc, idx + 1)) {
                    return true;
                }
            }
        }
        gameBoard[row][col] = temp;
        return false;
    }
}