// Lab Sheet 3 - Q23: Second largest element in a 1-D array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class SecondLargestProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int largest = arr[0];
        for (int x : arr)
            if (x > largest)
                largest = x;
        boolean found = false;
        int second = 0;
        for (int x : arr) {
            if (x != largest && (!found || x > second)) {
                second = x;
                found = true;
            }
        }
        if (found)
            System.out.println("Second largest element = " + second);
        else
            System.out.println("No second largest element (all elements are equal).");
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

public class Q23_SecondLargest {
    public static void main(String[] args) {
        SecondLargestProgram program = new SecondLargestProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
