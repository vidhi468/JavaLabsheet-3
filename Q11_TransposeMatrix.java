// Lab Sheet 3 - Q11: Transpose of a matrix
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class TransposeMatrixProgram {
    void run(Scanner sc) {
        int[][] m = readMatrixWithSize(sc);
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];             // rows become columns
        System.out.println("Transpose:");
        printMatrix(t);
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

public class Q11_TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrixProgram program = new TransposeMatrixProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
