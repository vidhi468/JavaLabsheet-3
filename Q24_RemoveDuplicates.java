// Lab Sheet 3 - Q24: Remove duplicate elements (without collections)
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class RemoveDuplicatesProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        int[] unique = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate)
                unique[count++] = arr[i];
        }
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
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

public class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicatesProgram program = new RemoveDuplicatesProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
