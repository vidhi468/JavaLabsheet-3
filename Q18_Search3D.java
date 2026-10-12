// Lab Sheet 3 - Q18: Search for an element in a 3-D array and display its position
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Search3DProgram {
    void run(Scanner sc) {
        int[][][] a = read3D(sc);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == key) {
                        System.out.println("Found at position [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
        if (!found)
            System.out.println("Element not found");
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

public class Q18_Search3D {
    public static void main(String[] args) {
        Search3DProgram program = new Search3DProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
