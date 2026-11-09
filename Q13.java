
class Q13Student<T, U, V> {

    T id;
    U name;
    V marks;

    Q13Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Q13 {

    public static void main(String[] args) {

        Q13Student<Integer, String, Double> s1 =
                new Q13Student<>(101, "Rahul", 85.5);

        Q13Student<Integer, String, Double> s2 =
                new Q13Student<>(102, "Amit", 90.5);

        Q13Student<Integer, String, Double> s3 =
                new Q13Student<>(103, "Rohit", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}