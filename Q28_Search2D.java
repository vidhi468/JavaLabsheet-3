// Lab Sheet 3 - Q28: Search an element in a 2-D array and display its row and column
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Search2DProgram {
    void run(Scanner sc) {
        int[][] m = readMatrixWithSize(sc);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == key) {
                    System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
        if (!found)
            System.out.println("Element not found");
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

public class Q28_Search2D {
    public static void main(String[] args) {
        Search2DProgram program = new Search2DProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
