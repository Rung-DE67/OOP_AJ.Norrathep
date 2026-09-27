class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String name, double price) {
        this.title = title;
        this.author = name;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Developing Java Software", "Russel Winder", 79.75);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: " + myBook.getPrice());
    }
}