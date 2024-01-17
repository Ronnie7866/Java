package DataStructureAndAlgorithms.Backtracking;

public class MaxGold {
    public static void main(String[] args) {
        int[][] arr = {{0,6,0},{5,8,7},{0,9,0}};
        int m = arr.length;
        int n = arr[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    int gold = maxGoldII(arr, i, j, m, n);
                    max = Math.max(gold,max);
                }
            }
        }
        System.out.println(max);
    }

    private static int maxGold(int[][] arr, boolean[][] vis, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || arr[i][j] == 0 || vis[i][j]) {
            return 0;
        }
        int max = 0;
        vis[i][j] = true;
        int left = maxGold(arr, vis, i, j - 1, m, n);
        int right = maxGold(arr, vis, i, j + 1,m, n);
        int up = maxGold(arr, vis,i - 1, j, m, n);
        int down = maxGold(arr, vis, i + 1, j, m, n);
        vis[i][j] = false;
        max = Math.max(left, Math.max(right, Math.max(up, down))) + arr[i][j];

        return max;
    }

    private static int maxGoldII(int[][] arr, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || arr[i][j] == 0) {
            return 0;
        }
        int max = 0;

        int val = arr[i][j];
        arr[i][j] = 0;
        int left = maxGoldII(arr, i, j - 1, m, n);
        int right = maxGoldII(arr, i, j + 1,m, n);
        int up = maxGoldII(arr,i - 1, j, m, n);
        int down = maxGoldII(arr, i + 1, j, m, n);
        arr[i][j] = val;
        max = Math.max(left, Math.max(right, Math.max(up, down))) + arr[i][j];

        return max;
    }
}
