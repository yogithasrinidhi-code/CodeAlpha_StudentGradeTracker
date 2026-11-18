
import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n------ STUDENT LIST ------");

        for (Student student : students) {
            System.out.println(
                "Name: " + student.getName()
                + " | Marks: " + student.getMarks()
                + " | Grade: " + student.getGrade()
            );
        }
    }

    // Calculate average
    public void calculateAverage() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        double average = total / students.size();

        System.out.printf("Average Marks: %.2f%n", average);
    }

    // Find highest marks
    public void findHighest() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        Student highest = students.get(0);

        for (Student student : students) {
            if (student.getMarks() > highest.getMarks()) {
                highest = student;
            }
        }

        System.out.println("Topper: " + highest.getName());
        System.out.println("Highest Marks: " + highest.getMarks());
    }

    // Find lowest marks
    public void findLowest() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        Student lowest = students.get(0);

        for (Student student : students) {
            if (student.getMarks() < lowest.getMarks()) {
                lowest = student;
            }
        }

        System.out.println("Lowest Scorer: " + lowest.getName());
        System.out.println("Lowest Marks: " + lowest.getMarks());
    }

    // Generate summary report
    public void generateReport() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n========== SUMMARY REPORT ==========");

        displayStudents();
        calculateAverage();
        findHighest();
        findLowest();

        System.out.println("Total Students: " + students.size());

        System.out.println("====================================");
    }
}
