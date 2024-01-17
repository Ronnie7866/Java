package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void helper(List<List<String>> ans, int n, char[][] board, int row) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                helper(ans, n, board, row+1);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int j = 0; j < board.length; j++) { // check row
            if(board[row][j] == 'Q') return false;
        }
        for (int i = 0; i < board.length; i++) { // check col
            if(board[i][col] == 'Q') return false;
        }

        // NW     N     NE
        //  W     Q      E
        //  SW    S     SE

        int i = row;
        int j = col;
        while (i >= 0 && j >= 0) { // North West
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        i = row;
        j = col;
        while (i >= 0 && j < board.length) { // North East
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        i = row;
        j = col;
        while (i < board.length && j < board.length) { // South East
            if (board[i][j] == 'Q') {
                return false;
            }
            i++;
            j++;
        }

        i = row;
        j = col;
        while (i < board.length && j >= 0) { // South West
            if (board[i][j] == 'Q') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(ans, n, board, 0);
    }
}
