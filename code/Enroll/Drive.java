// Driver.java
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a student
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);

        // Enroll in course
        System.out.print("Enter course to enroll in: ");
        String courseName = scanner.nextLine();
        Course course = new Course(courseName);
        student.enrollInCourse(course);

        scanner.close();
    }
}
