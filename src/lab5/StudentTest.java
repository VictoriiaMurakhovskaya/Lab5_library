package lab5;

import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void giveBook() {
        ArrayList<Book> st_books = new ArrayList<>();
        Student st = new Student(123, "John", "Doe", "Group1");
        Book book1 = new Book("Title1", "Author1", "ISBN1", 2020, 2);
        st_books.add(book1);
        st.giveBook(book1);
        Assert.assertEquals(st.borrowedBooks, st_books);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Student st = new Student(123, "John", "Doe", "Group1");

        String expected =  "ID: 123, Name: John, Surname: Doe, group: Group1";
        String actual = st.toString();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void allbooks() {
    }

    @org.junit.jupiter.api.Test
    void removeBook() {
    }
}