
class Product<T, U> {
    T id;
    U price;

    Product(T id, U price) {
        this.id = id;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: " + price);
    }
}

public class Q5 {
    public static void main(String[] args) {

        Product<Integer, Double> p1 =
                new Product<>(101, 250.50);

        Product<Integer, Double> p2 =
                new Product<>(102, 450.75);

        Product<Integer, Double> p3 =
                new Product<>(103, 600.00);

        p1.display();
        p2.display();
        p3.display();
    }
}