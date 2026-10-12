// Lab Sheet 3 - Q20: Marks of students with a different number of subjects (jagged array)
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class StudentMarksJaggedProgram {
    void run(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects of student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.print("Enter " + subjects + " marks: ");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
        System.out.println("\nStudent marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " (" + marks[i].length + " subjects): ");
            for (int m : marks[i])
                System.out.print(m + " ");
            System.out.println();
        }
    }
}

public class Q20_StudentMarksJagged {
    public static void main(String[] args) {
        StudentMarksJaggedProgram program = new StudentMarksJaggedProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
