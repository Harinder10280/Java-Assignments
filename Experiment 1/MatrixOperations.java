import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter rows and columns for Matrix 1: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        
        System.out.println("Enter elements for Matrix 1: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter rows and columns for Matrix 2: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        
        System.out.println("Enter elements for Matrix 2: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Addition:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
                }
                System.out.println();
            }
            
            System.out.println("Subtraction:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
                }
                System.out.println();
            }
            
            System.out.println("Multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    int sum = 0;
                    for (int k = 0; k < cols1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix dimensions do not match for addition, subtraction or multiplication.");
        }
    }
}
