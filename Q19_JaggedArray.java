// Lab Sheet 3 - Q19: Create and display a jagged array with 3 rows of different lengths
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class JaggedArrayProgram {
    void run(Scanner sc) {
        int[][] jag = new int[3][];            // only the number of rows is fixed
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];             // each row gets its own length
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        System.out.println("Jagged array:");
        for (int[] row : jag) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

public class Q19_JaggedArray {
    public static void main(String[] args) {
        JaggedArrayProgram program = new JaggedArrayProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
