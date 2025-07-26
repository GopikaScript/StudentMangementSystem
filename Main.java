import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();
                    StudentDAO.addStudent(name, email, course);
                    break;
                case 2:
                    StudentDAO.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    StudentDAO.deleteStudent(id);
                    break;
                case 4:
                    System.out.println("Exiting..."); 
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

