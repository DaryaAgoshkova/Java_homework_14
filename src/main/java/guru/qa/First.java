package guru.qa;

public class First {

    public static void main(String[] args) {
        String str = "Book";
        Conditions book = new Conditions();
        book.price = 500;
        book.name = "Atlas Shrugged";
        book.type();
        book.sayName();
    }
}
