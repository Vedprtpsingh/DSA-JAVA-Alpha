package DSA17BackTracking;

public class sudokoprogram {
    // Function to check if it's safe to place a digit in a specific cell of the Sudoku grid
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check row for the same digit
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Check column for the same digit
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Check 3x3 subgrid for the same digit
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true; // Digit can be placed in this cell
    }
    // Recursive function to solve the Sudoku puzzle
    public static boolean sudokusolver(int[][] sudoku, int row, int col) {
        // Base case: If we have reached the last cell, return true (solution found)
        if (row == 9 && col == 0) {
            return true;
        }
        // Calculate indices for the next cell
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // If the current cell is not empty, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextRow, nextCol);
        }
        // Try placing digits from 1 to 9 in the current empty cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit
                if (sudokusolver(sudoku, nextRow, nextCol)) {
                    return true; // If solution found, return true
                }
                sudoku[row][col] = 0; // Backtrack if solution not found
            }
        }
        return false; // No valid digit for this cell, backtrack
    }
    // Function to print the Sudoku grid
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Main method to test the Sudoku solver
    public static void main(String[] args) {
        int sudoku[][] =   {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }};
        if (sudokusolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exist.");
        }
    }
}

