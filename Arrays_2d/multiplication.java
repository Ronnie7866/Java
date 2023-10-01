package Arrays_2d;
import java.util.Scanner;

public class multiplication {

    static void multiplicationOf2dArrays(int [][]arr,int arr2[][],int r,int c,int r2,int c2){
        if (c != r2){
            System.out.println("Wrong Input multiplication not possible: ");
            return;
        }
        int [][] ans = new int[r][c2];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c2; j++){
                //where k is only a iterating variable
                for (int k = 0; k < c; k++){
                    ans[i][j] += arr[i][k] * arr2[k][j];
                }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of Matrix 1 ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " elements: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of Matrix 2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " elements: ");
        for (int i = 0; i < r2; i++){
            for (int j = 0; j < c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 :");
        print2dArray(arr);
        System.out.println("Matrix 2 :");
        print2dArray(arr2);
        System.out.println("Multiplication of Matrix 1 and Matrix 2 is: ");
        multiplicationOf2dArrays(arr,arr2,r,c,r2,c2);
    }
}
