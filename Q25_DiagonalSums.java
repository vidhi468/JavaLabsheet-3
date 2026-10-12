// Lab Sheet 3 - Q25: Sum of main diagonal and secondary diagonal of a square matrix
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class DiagonalSumsProgram {
    void run(Scanner sc) {
        int[][] m = readSquareMatrix(sc);
        int n = m.length;
        int main = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            main += m[i][i];                   // main diagonal
            secondary += m[i][n - 1 - i];      // secondary diagonal
        }
        System.out.println("Sum of main diagonal      = " + main);
        System.out.println("Sum of secondary diagonal = " + secondary);
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

public class Q25_DiagonalSums {
    public static void main(String[] args) {
        DiagonalSumsProgram program = new DiagonalSumsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
