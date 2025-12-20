public class f_sudoku {
    public static boolean solveSudoku(int[][] sudoku, int row, int col) {

        // base case
        if (row == 9 && col == 0) {
            return true;
        }

        // recursive case
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextrow, nextcol);

        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;

    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            // Print the solved Sudoku
            for (int r = 0; r < 9; r++) {
                for (int d = 0; d < 9; d++) {
                    System.out.print(sudoku[r][d] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
        System.out.println("Sudoku Solver Placeholder");
    }

}
