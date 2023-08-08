import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of the student out of 100:");
        int marks = input.nextInt();
        char grade = 'F'; // default grade is F
        if (marks >= 90) {
            // if marks are 90 or above, grade is A
            grade = 'A';
        } else if (marks >= 80) {
            // if marks are 80 to 89, grade is B
            grade = 'B';
        } else if (marks >= 70) {
            // if marks are 70 to 79, grade is C
            grade = 'C';
        } else if (marks >= 60) {
            // if marks are 60 to 69, grade is D
            grade = 'D';
        }
        // otherwise, grade is F
        System.out.println("The grade of the student is " + grade);
        input.close();
    }
}
