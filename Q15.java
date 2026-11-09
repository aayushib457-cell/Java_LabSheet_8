
import java.util.ArrayList;
import java.util.Scanner;

class Q15Student<T, U, V> {

    T id;
    U name;
    V marks;

    Q15Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class Q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Q15Student<Integer, String, Double>> students =
                new ArrayList<>();

        students.add(new Q15Student<>(101, "Rahul", 85.5));
        students.add(new Q15Student<>(102, "Amit", 90.0));
        students.add(new Q15Student<>(103, "Rohit", 78.5));
        students.add(new Q15Student<>(104, "Sumit", 88.0));
        students.add(new Q15Student<>(105, "Ankit", 92.5));

        // Display all students
        System.out.println("All Students:");

        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
        }

        // Search student
        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Q15Student<Integer, String, Double> s : students) {

            if (s.id.equals(searchId)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }

        // Total students
        System.out.println("Total Students: " + students.size());

        // Type Safety
        System.out.println("Type Safety: Integer ID, String Name, Double Marks");

        sc.close();
    }
}