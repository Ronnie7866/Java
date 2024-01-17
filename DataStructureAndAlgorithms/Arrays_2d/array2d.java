package DataStructureAndAlgorithms.Arrays_2d;
import java.util.Scanner;

public class array2d {

    static void sum(int arr1[][],int arr2 [][],int r1, int c1, int r2, int c2){
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input addition not possible:");
            {
                return;
            }
        }
            int ans [][] = new int[r1][c1];
            for (int i = 0; i < r1; i++){
                for (int j = 0; j < c1; j++){
                    ans[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        print2dArray(ans);
        }

    static void print2dArray(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] tranpose(int arr[][], int r, int c){
        int [][]ans = new int[c][r];
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void transposeInPlace (int arr[][], int r, int c){
        for (int i = 0; i < r; i++){
            for (int j = i; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int arr[]){
        int i = 0; int j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateMatrix(int matrix[][], int n){
        transposeInPlace(matrix,n,n);

        for (int i = 0; i < n; i++){
            reverseArray(matrix[i]);
        }
    }

    static int [][] pascalTriangle(int n){
        int ans [][] = new int[n][];
        for (int i = 0; i < n; i++){
                ans [i] = new int[i+1];
                ans[i][0] = ans[i][i] = 1;

                for (int j = 1; j < i; j++){
                    ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
                }
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
//        }

//        System.out.println("Enter rows and columns of Matrix 2 ");
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//        int arr2[][] = new int[r2][c2];
//        System.out.println("Enter " + r2 * c2 + " elements: ");
//        for (int i = 0; i < r2; i++){
//            for (int j = 0; j < c2; j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }

//        System.out.println("Matrix 1");
//        print2dArray(arr1);
//        System.out.println("Matrix 2");
//        print2dArray(arr2);
//        System.out.println("Sum of Matrix 1 and Matrix 2 is" );
//        sum(arr1,arr2,r1, r2,c1,c2);

//        int ans [][] = tranpose(arr1, r1, c1);
//        print2dArray(arr1);
//        print2dArray(ans);

//        System.out.println("Matrix 1");
//        print2dArray(arr);
//        System.out.println("Transposed Matrix");
//        transposeInPlace(arr,r,c);
//        print2dArray(arr);

//        rotateMatrix(arr,r);
//        print2dArray(arr);


//        int ans [][] = pascalTriangle(n);
//        System.out.println("Pascal Triangle");
//        print2dArray(ans);

    }
}
