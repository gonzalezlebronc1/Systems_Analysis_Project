import java.util.Scanner;


//Main class to run the program

public class Driver {

    public static void main(String[] args) {

        UniversitySystem university = new UniversitySystem();

        Scanner scanner = new Scanner(System.in);


        // Validate application decision

        String response;

        while (true) {

            System.out.println("Do you want to apply to the University of Dayton? (yes/no)");

            response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("yes") || response.equals("no")) {

                break;

            }

            System.out.println("Invalid input. Please enter 'yes' or 'no'.");

        }


        if (!response.equals("yes")) {

            System.out.println("Application process canceled.");

            scanner.close();

            return;

        }


        // Student applies

        String name;

        do {

            System.out.println("\nEnter Student Name:");

            name = scanner.nextLine().trim();

            if (name.isEmpty()) {

                System.out.println("Name cannot be empty. Please try again.");

            }

        } while (name.isEmpty());


        int age;

        while (true) {

            System.out.println("Enter Student Age:");

            if (scanner.hasNextInt()) {

                age = scanner.nextInt();

                scanner.nextLine();

                if (age > 0) {

                    break;

                }

            } else {

                scanner.next();

            }

            System.out.println("Invalid age. Please enter a valid positive number.");

        }


        String email;

        do {

            System.out.println("Enter Student Email:");

            email = scanner.nextLine().trim();

            if (!email.contains("@") || !email.contains(".")) {

                System.out.println("Invalid email format. Please enter a valid email.");

                email = "";

            }

        } while (email.isEmpty());


        String major;

        do {

            System.out.println("Enter Student Major:");

            major = scanner.nextLine().trim();

            if (major.isEmpty()) {

                System.out.println("Major cannot be empty. Please try again.");

            }

        } while (major.isEmpty());


        Student student = new Student(name, age, email, major);

        university.submitApplication(student);


        // Administrator reviews applications

        university.reviewApplications();


        // Display application status

        university.showApplicationStatus();


     // Allow major change if accepted

        if (university.isAccepted(student)) {

            String changeMajorResponse;

            while (true) {

                System.out.println("\nWould you like to change your major? (yes/no)");

                changeMajorResponse = scanner.nextLine().trim().toLowerCase();

                if (changeMajorResponse.equals("yes") || changeMajorResponse.equals("no")) {

                    break;

                }

                System.out.println("Invalid input. Please enter 'yes' or 'no'.");

            }


            if (changeMajorResponse.equals("yes")) {

                String newMajor;

                do {

                    System.out.println("Enter new major:");

                    newMajor = scanner.nextLine().trim();

                    if (newMajor.isEmpty()) {

                        System.out.println("New major cannot be empty. Please try again.");

                    }

                } while (newMajor.isEmpty());


                student.requestMajorChange(newMajor, university);

            }

        }

        scanner.close();

    }

}