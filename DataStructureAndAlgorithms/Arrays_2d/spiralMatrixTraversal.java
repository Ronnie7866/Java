package DataStructureAndAlgorithms.Arrays_2d;
import java.util.Scanner;

public class spiralMatrixTraversal {

    static void print2dArray(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//        static void spiralPrint(int matrix [][], int r, int c){
//        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c-1;
//        int totalElements = 0;
//        while (totalElements  < n*n){
//            // top row --> left col - right col
//            for (int j = leftColumn; j <= rightColumn && totalElements < n*n; j++){
//                System.out.print(matrix[topRow][j] + " ");
//                totalElements++;
//            }
//            topRow++;
//
//            // rightcol --> toprow - bottomrow
//            for (int i = topRow; i <= bottomRow && totalElements < n*n; i++) {
//                System.out.print(matrix[i][rightColumn] + " ");
//                totalElements++;
//            }
//            rightColumn--;
//
//            // bottomrow --> leftcol - rightcol
//            for (int j = rightColumn; j >= leftColumn && totalElements < n*n; j--){
//                System.out.print(matrix[bottomRow][j] + " ");
//                totalElements++;
//            }
//            bottomRow--;
//
//            // leftcol --> bottorow - toprow
//            for (int i = bottomRow; i >= topRow && totalElements < n*n; i--){
//                System.out.print(matrix[i][leftColumn] + " ");
//                totalElements++;
//            }
//            leftColumn++;
//        }
//    }

    static int [][] generateSpiralMatrix(int n){
        int topRow = 0, bottomRow = n-1, leftColumn = 0, rightColumn = n-1;
        
        int totalElements = 1;
        int ans [][] = new int[n][n];
        
        while (totalElements  <= n*n){
            // top row --> left col - right col
            for (int j = leftColumn; j <= rightColumn && totalElements < n*n; j++){
                ans[topRow][j] = totalElements++;
            }
            topRow++;

            // rightcol --> toprow - bottomrow
            for (int i = topRow; i <= bottomRow && totalElements < n*n; i++) {
                ans[i][rightColumn] = totalElements++;
            }
            rightColumn--;

            // bottomrow --> leftcol - rightcol
            for (int j = rightColumn; j >= leftColumn && totalElements < n*n; j--){
                ans[bottomRow][j] = totalElements++;
            }
            bottomRow--;

            // leftcol --> bottorow - toprow
            for (int i = bottomRow; i >= topRow && totalElements < n*n; i--){
                ans[i][leftColumn] = totalElements++;
            }
            leftColumn++;
        }
        return ans;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println("Enter rows and columns of Matrix 1 ");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int arr[][] = new int[r][c];
//        System.out.println("Enter " + r * c + " elements: ");
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                arr[i][j] = sc.nextInt();
//            }
            int ans[][]  = generateSpiralMatrix(n);
            print2dArray(ans);
        }
            
}

