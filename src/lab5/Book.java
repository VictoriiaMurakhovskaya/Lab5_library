package lab5;

public class Book {
    String title;
    String author;
    String isbn;
    int year;
    int quantity;

    public Book() {
        title = "no name";
        author = "no name";
        isbn = "no name";
        year = 0;
        quantity = 0;
    }

    public Book(String newtitle, String newauthor, String newisbn, int newyear, int qty) {
        title = newtitle;
        author = newauthor;
        isbn = newisbn;
        year = newyear;
        quantity = qty;
    }

    public String toString() {
        return "Isbn: " + isbn + ", Title: " + title + ", Author: " + author +  ", Year: " + year
                + ", Quantity " + quantity;
    }
}
