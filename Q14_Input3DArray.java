// Lab Sheet 3 - Q14: Input and display a 2 x 2 x 2 3-D array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Input3DArrayProgram {
    void run(Scanner sc) {
        int[][][] a = read3D(sc);
        System.out.println("3-D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + "\t");
                System.out.println();
            }
        }
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

public class Q14_Input3DArray {
    public static void main(String[] args) {
        Input3DArrayProgram program = new Input3DArrayProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
