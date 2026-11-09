
class Container<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Q12 {
    public static void main(String[] args) {

        Container<Integer> c1 = new Container<>();
        c1.add(100);

        Container<String> c2 = new Container<>();
        c2.add("Hello Java");

        Container<Double> c3 = new Container<>();
        c3.add(45.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}