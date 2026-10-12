// Lab Sheet 3 - Q6: Copy all elements from one array to another
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CopyArrayProgram {
    void run(Scanner sc) {
        int[] source = readArrayWithSize(sc);
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++)
            copy[i] = source[i];
        System.out.print("Copied array: ");
        for (int x : copy)
            System.out.print(x + " ");
        System.out.println();
    }

    // Reads n integers into a new array
    int[] readArray(Scanner sc, int n) {
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    int[] readArrayWithSize(Scanner sc) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        return readArray(sc, n);
    }
}

public class Q06_CopyArray {
    public static void main(String[] args) {
        CopyArrayProgram program = new CopyArrayProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
