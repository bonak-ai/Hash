import java.util.HashMap;
import java.util.Scanner;

public class MentalHealthHash {

    private static HashMap<String, String> mentalHealthMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
      System.out.println("\n--- Student Mental Health Tracker ---");
   System.out.println("1. Add Student Mental Health State");
   System.out.println("2. Update Student Menal Health State");
          System.out.println("3. View All Students");
       System.out.println("4. Search for a Student");
            System.out.println("5. Remove a Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    searchStudent(scanner);
                    break;
                case 5:
                    removeStudent(scanner);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mental health state ( Good, Average, Poor): ");
        String state = scanner.nextLine();

        if (mentalHealthMap.containsKey(name)) {
            System.out.println("Student already exists. Use the update option instead.");
        } else {
            mentalHealthMap.put(name, state);
            System.out.println("Student added successfully.");
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        if (mentalHealthMap.containsKey(name)) {
            System.out.print("Enter new mental health state: ");
            String state = scanner.nextLine();
            mentalHealthMap.put(name, state);
            System.out.println("Mental health state updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void viewAllStudents() {
        if (mentalHealthMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n--- All Students ---");
            for (String name : mentalHealthMap.keySet()) {
                System.out.println("Name: " + name + ", Mental Health State: " + mentalHealthMap.get(name));
            }
        }
    }

 private static void searchStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        if (mentalHealthMap.containsKey(name)) {
            System.out.println("Name: " + name + ", Mental Health State: " + mentalHealthMap.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void removeStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        if (mentalHealthMap.containsKey(name)) {
            mentalHealthMap.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
