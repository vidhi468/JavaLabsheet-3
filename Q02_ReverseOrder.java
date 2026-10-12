// Lab Sheet 3 - Q2: Input 10 integers and display them in reverse order
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ReverseOrderProgram {
    void run(Scanner sc) {
        int[] arr = readArray(sc, 10);
        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
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

public class Q02_ReverseOrder {
    public static void main(String[] args) {
        ReverseOrderProgram program = new ReverseOrderProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
