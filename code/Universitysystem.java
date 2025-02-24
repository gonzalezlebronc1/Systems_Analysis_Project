import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//University system handling applications
class UniversitySystem {
 private List<Application> applications = new ArrayList<>();
 private Random random = new Random();

 public void submitApplication(Student student) {
     Application app = new Application(student);
     applications.add(app);
     System.out.println("\nApplication submitted for: " + student.getName());

     // Randomly determine if the student is accepted or rejected
     int decision = random.nextInt(2); // Generates 0 or 1
     if (decision == 1) {
         app.approve();
         System.out.println("Auto-Decision: Application APPROVED for " + student.getName());
     } else {
         app.reject();
         System.out.println("Auto-Decision: Application REJECTED for " + student.getName());
     }
 }
 public void reviewApplications() {
     Scanner scanner = new Scanner(System.in);
     for (Application app : applications) {
         if (app.getStatus().equals("Pending")) {
             System.out.println("\nReviewing application for: " + app.getStudent().getName());
             System.out.println("1. Approve\n2. Reject");
             int choice = scanner.nextInt();
             if (choice == 1) {
                 app.approve();
                 System.out.println("Application manually approved for: " + app.getStudent().getName());
             } else {
                 app.reject();
                 System.out.println("Application manually rejected for: " + app.getStudent().getName());
             }
         }
     }
 }

 public void showApplicationStatus() {
     System.out.println("\nApplication Status:");
     for (Application app : applications) {
         System.out.println(app.getStudent().getName() + " - " + app.getStatus());
     }
 }
}