public class d_NQueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean solveNQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;

            // print the board

            // printBoard(board);
            return true;
        }

        // placing the queens and checking for each column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // place queen
                if (solveNQueens(board, row + 1)) {
                    return true;
                } // recursive call
                board[row][j] = 'x'; // backtrack
            }
        }
        return false;
    }

    static int count = 0;

    public static void printBoard(char board[][]) {
        System.out.print("----possible solution----\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int n = 5; // Example for 4-Queens
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
        ;
        System.out.println("Total solutions: " + count);

    }
}
