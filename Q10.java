
import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {

        ArrayList<String> names =
                new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Rohit");
        names.add("Sumit");
        names.add("Ankit");

        System.out.println("Original List: " + names);

        System.out.println("Get: " + names.get(1));

        names.set(1, "Vikas");

        System.out.println("After Set: " + names);

        names.remove("Rohit");

        System.out.println("After Remove: " + names);

        System.out.println("Size: " + names.size());
    }
}