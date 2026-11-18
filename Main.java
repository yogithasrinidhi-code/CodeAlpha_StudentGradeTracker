
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        int choice=0;

        do {

            System.out.println("\n================================");
            System.out.println("       STUDENT GRADE TRACKER");
            System.out.println("================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Show Highest Marks");
            System.out.println("5. Show Lowest Marks");
            System.out.println("6. Generate Summary Report");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter marks (0-100): ");

                    if (!sc.hasNextDouble()) {
                        System.out.println("Please enter valid marks.");
                        sc.nextLine();
                        break;
                    }

                    double marks = sc.nextDouble();
                    sc.nextLine();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                        break;
                    }

                    Student student = new Student(name, marks);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    manager.calculateAverage();
                    break;

                case 4:
                    manager.findHighest();
                    break;

                case 5:
                    manager.findLowest();
                    break;

                case 6:
                    manager.generateReport();
                    break;

                case 7:
                    System.out.println("Thank you for using Student Grade Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
