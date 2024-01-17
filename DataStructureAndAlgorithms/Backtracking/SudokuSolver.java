package DataStructureAndAlgorithms.Backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] arr =
                {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        sudokuSolver(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sudokuSolver(char[][] board, int i, int j) {
        if (i == board.length) {
            return;
        }

        int ni = 0;
        int nj = 0;
        if (j == board[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (board[i][j] != '.') {
            sudokuSolver(board, ni, nj);
        }
        else {
            for (int po = 1; po <= 9; po++) {
                if (isValid(board, i, j, po)) {
                    board[i][j] = (char)(po-'0'); // typecasting int to char
                    sudokuSolver(board, ni, nj);// call the function again
                    board[i][j] = '.';// backtracking
                }
            }
        }
    }

    private static boolean isValid(char[][] board, int x, int y, int val) {
        // check row
        for (int j = 0; j < board[0].length; j++) {
            if (board[x][j] == val) {
                return false;
            }
        }

        // check col
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == val) {
                return false;
            }
        }

        // checkSubMatrix

        int smi = x / 3 * 3;// sbi -> submatrix
        int smj = y / 3 * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[smi + i][smj + j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
