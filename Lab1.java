public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : ₹" + this.price);
        System.out.println("-----------------------------------");
    }
}
public class Lab1 {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 499.0);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 350.0);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 400.0);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}


