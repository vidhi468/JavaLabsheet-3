// Lab Sheet 3 - Q17: Maximum element in a 3-D array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Maximum3DProgram {
    void run(Scanner sc) {
        int[][][] a = read3D(sc);
        int max = a[0][0][0];
        for (int[][] plane : a)
            for (int[] row : plane)
                for (int x : row)
                    if (x > max)
                        max = x;
        System.out.println("Maximum element = " + max);
    }

    // Reads a 2 x 2 x 2 array
    int[][][] read3D(Scanner sc) {
        int[][][] a = new int[2][2][2];
        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();
        return a;
    }
}

public class Q17_Maximum3D {
    public static void main(String[] args) {
        Maximum3DProgram program = new Maximum3DProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
