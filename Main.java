import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        inputAction(mat1, mat2);
        outputAction(mat1, mat2, mat3);

    }

    private static void outputAction(int[][] mat1, int[][] mat2, int[][] mat3) {
        System.out.println("Multiplied matrix");
        calculate(mat1, mat2, mat3);
    }

    private static void calculate(int[][] mat1, int[][] mat2, int[][] mat3) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();//new line
        }
    }


    private static void inputAction(int[][] mat1, int[][] mat2) {
        System.out.println("Enter the first matrix");
        input(mat1);
        System.out.println("Your first matrix");
        output(mat1);
        System.out.println("Enter the second matrix");
        input(mat2);
        System.out.println("Your second matrix");
        output(mat2);
    }

    private static void input(int[][] whichMat) {
        Scanner matElementInput = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int matElement = matElementInput.nextInt();
                whichMat[i][j] = matElement;
            }
        }
    }

    private static void output(int[][] whichMat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(whichMat[i][j]);
            }
            System.out.println();
        }
    }
}