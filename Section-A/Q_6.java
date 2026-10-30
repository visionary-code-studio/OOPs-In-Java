import java.util.Scanner;

public class MatrixOperationsMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrixA = null;
        int[][] matrixB = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Matrix Operations Menu ---");
            System.out.println("1. Create/Display | 2. Add | 3. Subtract | 4. Multiply | 5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    matrixA = createMatrix("A");
                    matrixB = createMatrix("B");
                    displayMatrix("Matrix A", matrixA);
                    displayMatrix("Matrix B", matrixB);
                    break;
                case 2:
                    if (valid(matrixA, matrixB, "add")) 
                        displayMatrix("Sum", add(matrixA, matrixB, true));
                    break;
                case 3:
                    if (valid(matrixA, matrixB, "sub")) 
                        displayMatrix("Difference", add(matrixA, matrixB, false));
                    break;
                case 4:
                    if (matrixA != null && matrixB != null && matrixA[0].length == matrixB.length)
                        displayMatrix("Product", multiply(matrixA, matrixB));
                    else System.out.println("Invalid dimensions for multiplication.");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static int[][] createMatrix(String name) {
        System.out.print("Rows for " + name + ": "); int r = scanner.nextInt();
        System.out.print("Cols for " + name + ": "); int c = scanner.nextInt();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                m[i][j] = scanner.nextInt();
            }
        return m;
    }

    private static void displayMatrix(String label, int[][] m) {
        System.out.println(label + ":");
        if (m == null) { System.out.println("Empty"); return; }
        for (int[] row : m) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    private static boolean valid(int[][] a, int[][] b, String op) {
        if (a == null || b == null) { System.out.println("Create matrices first."); return false; }
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Dimensions must match for " + op + "."); return false;
        }
        return true;
    }

    private static int[][] add(int[][] a, int[][] b, boolean isAdd) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = isAdd ? a[i][j] + b[i][j] : a[i][j] - b[i][j];
        return res;
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }
}
