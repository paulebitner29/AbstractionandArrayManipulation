package inputGrades;
import java.util.Scanner;
import java.text.DecimalFormat;

// Abstract class defining common methods for student grades
abstract class StudentGrades {
    // Declare an abstract method to calculate and print the average grade
    public abstract void averageGrade();

    // Declare an abstract method to calculate and print the maximum grade
    public abstract void maxGrade();

    // Declare an abstract method to calculate and print the minimum grade
    public abstract void minGrade();

    // Declare an abstract method to display individual grades
    public abstract void displayGrades();
    
}

// Concrete class that extends StudentGrades and implements its methods
class Result extends StudentGrades {
    private double[] studentGrades; // Array to store student grades

    // Constructor to initialize studentGrades array
    public Result(double[] grades) {
        this.studentGrades = grades;
    }

    // Implement the abstract method to calculate and print the average grade
    public void averageGrade() {
        double sum = 0;
        int numGrades = studentGrades.length;

        for (int i = 0; i < numGrades; i++) {
            sum += studentGrades[i];
        }

        // Calculate the average grade
        double average = sum / numGrades;

        // Create a DecimalFormat object to format the average to two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // Format the average
        String formattedAverage = decimalFormat.format(average);

        // Print the formatted average
        System.out.println("Average Grade: " + formattedAverage);
    }

    // Implement the abstract method to calculate and print the maximum grade
    public void maxGrade() {
        double max = studentGrades[0]; // Assume the first grade is the maximum

        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] > max) {
                max = studentGrades[i];
            }
        }

        // Print the maximum grade
        System.out.println("Maximum Grade: " + max);
    }

    // Implement the abstract method to calculate and print the minimum grade
    public void minGrade() {
        double min = studentGrades[0]; // Assume the first grade is the minimum

        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] < min) {
                min = studentGrades[i];
            }
        }

        // Print the minimum grade
        System.out.println("Minimum Grade: " + min);
    }

    // Implement the new method to display individual grades
    public void displayGrades() {
        System.out.println("Student Grades:");

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println(studentGrades[i]);
        }
    }
}

public class inputGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] studentGrades = new double[5]; // Create an array to store student grades

        System.out.println("Enter " + studentGrades.length + " student's grades:"); // Prompt the user for input

        // Read and store the grades in the array
        for (int i = 0; i < studentGrades.length; i++) {
            studentGrades[i] = scanner.nextDouble();
        }

        // Create an instance of the Result class
        Result result = new Result(studentGrades);

        // Call various methods to display and analyze grades
        result.displayGrades(); // Printing all grades
        result.averageGrade();  // Calculate and print the average grade
        result.maxGrade();      // Calculate and print the maximum grade
        result.minGrade();      // Calculate and print the minimum grade
    }
}