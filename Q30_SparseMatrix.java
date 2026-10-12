// Lab Sheet 3 - Q30: Check whether a matrix is sparse (more zeros than non-zeros)
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class SparseMatrixProgram {
    void run(Scanner sc) {
        int[][] m = readMatrixWithSize(sc);
        int zeros = 0, total = 0;
        for (int[] row : m)
            for (int x : row) {
                total++;
                if (x == 0)
                    zeros++;
            }
        int nonZeros = total - zeros;
        System.out.println("Zero elements     = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);
        if (zeros > nonZeros)
            System.out.println("The matrix is a SPARSE matrix");
        else
            System.out.println("The matrix is NOT a sparse matrix");
    }

    // Reads an r x c matrix
    int[][] readMatrix(Scanner sc, int r, int c, String name) {
        int[][] m = new int[r][c];
        System.out.println("Enter elements of matrix " + name + " (" + r + " x " + c + "):");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        return m;
    }

    int[][] readMatrixWithSize(Scanner sc) {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        return readMatrix(sc, r, c, "");
    }

    int[][] readSquareMatrix(Scanner sc) {
        System.out.print("Enter order of square matrix (n): ");
        int n = sc.nextInt();
        return readMatrix(sc, n, n, "");
    }

    void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + "\t");
            System.out.println();
        }
    }
}

public class Q30_SparseMatrix {
    public static void main(String[] args) {
        SparseMatrixProgram program = new SparseMatrixProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
