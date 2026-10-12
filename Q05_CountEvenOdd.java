// Lab Sheet 3 - Q5: Count even and odd numbers in an array
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CountEvenOddProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers  = " + odd);
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

public class Q05_CountEvenOdd {
    public static void main(String[] args) {
        CountEvenOddProgram program = new CountEvenOddProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
