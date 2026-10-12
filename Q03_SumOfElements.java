// Lab Sheet 3 - Q3: Sum of all elements in a 1-D array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class SumOfElementsProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int sum = 0;
        for (int x : arr)
            sum += x;
        System.out.println("Sum = " + sum);
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

public class Q03_SumOfElements {
    public static void main(String[] args) {
        SumOfElementsProgram program = new SumOfElementsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
