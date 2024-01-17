package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Rat_In_A_Maze {
    private static void ratInMaze(int[][] arr, int row, int col, boolean[][] isVisited, ArrayList<String> ans, String s) {
        if (row == arr.length - 1 && col == arr.length - 1 && arr[row][col] != 0) {
            ans.add(s);
            return;
        }
        if (row >= 0 && row < arr.length && col >= 0 && col < arr.length) {
            if (isVisited[row][col] || arr[row][col] == 0) return;
            isVisited[row][col] = true;
            ratInMaze(arr, row + 1, col, isVisited, ans, s + 'D');
            ratInMaze(arr, row, col + 1, isVisited, ans, s + 'R');
            isVisited[row][col] = false;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                       {1, 1, 0, 1},
                       {1, 1, 0, 0},
                       {0, 1, 1, 1}};
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] isVisited = new boolean[arr.length][arr.length];
        ratInMaze(arr, 0, 0, isVisited, ans, "");
        for (String path : ans) {
            System.out.println(path);
        }
    }
}
