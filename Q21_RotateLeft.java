// Lab Sheet 3 - Q21: Rotate an array to the left by one position
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class RotateLeftProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int first = arr[0];                    // keep the first element
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = first;           // put it at the end
        System.out.print("After left rotation: ");
        for (int x : arr)
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

public class Q21_RotateLeft {
    public static void main(String[] args) {
        RotateLeftProgram program = new RotateLeftProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
