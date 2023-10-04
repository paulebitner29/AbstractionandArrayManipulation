package studentGrades;

// Abstract class defining common methods for student grades
abstract class StudentGrades {
    public abstract void averageGrade(); // Declare an abstract method to calculate and print the average grade
    public abstract void maxGrade();     // Declare an abstract method to calculate and print the maximum grade
    public abstract void minGrade();     // Declare an abstract method to calculate and print the minimum grade
    public abstract void displayGrades(); // Declare an abstract to display individual grades
    
}

// Concrete class that extends StudentGrades and implements its methods
class Result extends StudentGrades {
    private int[] studentGrades; // Array to store student grades

    // Constructor to initialize studentGrades array
    public Result(int[] grades) {
        this.studentGrades = grades;
    }

    // Implement the abstract method to calculate and print the average grade
    public void averageGrade() {
        double sum = 0;
        int numGrades = studentGrades.length;

        for (int i = 0; i < numGrades; i++) {
            sum += studentGrades[i];
        }

        double average = sum / numGrades;
        System.out.println("Average Grade: " + average);
    }

    // Implement the abstract method to calculate and print the maximum grade
    public void maxGrade() {
        int max = studentGrades[0]; // Assume the first grade is the maximum

        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] > max) {
                max = studentGrades[i];
            }
        }

        System.out.println("Maximum Grade: " + max);
    }
    
    // Implement the abstract method to calculate and print the minimum grade
    public void minGrade() {
    	int min = studentGrades[0]; // Assume the first grade is the minimum
    	
    	for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] < min) {
                min = studentGrades[i];
            }
        }
    	
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

public class gradesOfStudents {
    public static void main(String[] args) {
        int[] studentGrades = {85, 92, 78, 88, 95, 89, 76, 98, 87, 91};
        
        Result result = new Result(studentGrades); // Create an instance of Result
        result.displayGrades(); // Printing all grades
        result.averageGrade(); // Calculate and print the average grade
        result.maxGrade();     // Calculate and print the maximum grade
        result.minGrade();     // Calculate and print the minimum grade
        
    }
}