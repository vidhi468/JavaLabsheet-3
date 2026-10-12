// Lab Sheet 3 - Q4: Maximum element in an array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class MaximumElementProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int max = arr[0];
        for (int x : arr)
            if (x > max)
                max = x;
        System.out.println("Maximum element = " + max);
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

public class Q04_MaximumElement {
    public static void main(String[] args) {
        MaximumElementProgram program = new MaximumElementProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
