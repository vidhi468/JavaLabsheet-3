// Lab Sheet 3 - Q29: Sort the elements of each row in a jagged array
// Name: Shanu Sharma | MCA III Semester
import java.util.Arrays;
import java.util.Scanner;

// Class that holds the logic of this question
class SortJaggedRowsProgram {
    void run(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jag = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        for (int[] row : jag)
            Arrays.sort(row);                  // sorts one row at a time
        System.out.println("Jagged array after sorting each row:");
        for (int[] row : jag) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        SortJaggedRowsProgram program = new SortJaggedRowsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
