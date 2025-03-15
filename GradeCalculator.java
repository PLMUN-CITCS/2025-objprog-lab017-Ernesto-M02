import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();

        // Calculate the grade based on the score
        String grade = calculateGrade(score);

        // Display the calculated grade to the user
        System.out.println("Your grade is: " + grade);
    }

    // Method to get the student's score from the user
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1; // Initialize score to an invalid value

        while (score < 0) { // Loop until a valid score is entered
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) { // Check if the input is a valid double
                score = scanner.nextDouble();
                if (score < 0) {
                    System.out.println("Score cannot be negative. Please enter a valid score.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric score.");
                scanner.next(); // Clear the invalid input
            }
        }

        return score; // Return the valid score
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}