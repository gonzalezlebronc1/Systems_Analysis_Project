import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Main class to run the program
public class Driver {
    public static void main(String[] args) {
        UniversitySystem university = new UniversitySystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to apply to the University of Dayton? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();

        if (!response.equals("yes")) {
            System.out.println("Application process canceled.");
            scanner.close();
            return;
        }

        // Student applies
        System.out.println("\nEnter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age:");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.println("Enter Student Email:");
        String email = scanner.nextLine();

        Student student = new Student(name, age, email);
        university.submitApplication(student);

        // Administrator reviews applications
        university.reviewApplications();

        // Display application status
        university.showApplicationStatus();
        scanner.close();
    }
}