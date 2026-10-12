// Lab Sheet 3 - Q22: Count how many times each element appears
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ElementFrequencyProgram {
    void run(Scanner sc) {
        int[] arr = readArrayWithSize(sc);
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;         // do not count this element again
                }
            }
            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
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

public class Q22_ElementFrequency {
    public static void main(String[] args) {
        ElementFrequencyProgram program = new ElementFrequencyProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
