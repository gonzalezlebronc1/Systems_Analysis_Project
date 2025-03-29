// Driver.java
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UniversitySystem system = new UniversitySystem();
        
        // Create a student
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter current major: ");
        String major = scanner.nextLine();
        Student student = new Student(name, major);
        
        // Request major change
        System.out.print("Enter new major: ");
        String newMajor = scanner.nextLine();
        student.requestMajorChange(newMajor, system);
        
        scanner.close();
    }
}

