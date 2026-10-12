// Lab Sheet 3 - Q1: Input and display 5 integers using a 1-D array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class Input5IntegersProgram {
    void run(Scanner sc) {
        int[] arr = readArray(sc, 5);
        System.out.print("Array elements: ");
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

public class Q01_Input5Integers {
    public static void main(String[] args) {
        Input5IntegersProgram program = new Input5IntegersProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
