// Lab Sheet 3 - Q7: Input and display a 3 x 3 matrix
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Matrix3x3Program {
    void run(Scanner sc) {
        int[][] m = readMatrix(sc, 3, 3, "");
        System.out.println("Matrix:");
        printMatrix(m);
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

public class Q07_Matrix3x3 {
    public static void main(String[] args) {
        Matrix3x3Program program = new Matrix3x3Program(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
