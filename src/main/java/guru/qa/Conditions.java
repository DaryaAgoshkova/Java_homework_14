package guru.qa;

public class Conditions {
    int price;
    String name;
    void type() {
        if (price == 500) {
            System.out.println("Electronic book");
        }
        else if (price == 1000) {
            System.out.println("Paper book");
        }
    }
    public void sayName() {
        System.out.println("Name of the book: " + name);

    }
}
