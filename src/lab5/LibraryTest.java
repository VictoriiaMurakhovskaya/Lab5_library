package lab5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addbook() {
        Library lib = new Library();
        Book book1 = new Book("Title1", "Author1", "ISBN1", 2020, 2);
        ArrayList<Book> expected = new ArrayList<>();
        expected.add(book1);
        lib.addbook(book1);
        Assert.assertEquals(expected, lib.books);
    }

    @Test
    void addstudent() {
        Library lib = new Library();
        Student st = new Student(123, "John", "Doe", "Group1");
        ArrayList<Student> expected = new ArrayList<>();
        Assert.assertEquals(expected, lib.students);
        expected.add(st);
        lib.addstudent(st);
        Assert.assertEquals(expected, lib.students);
    }

    @Test
    void getbookbyISBN() {
        Library lib = new Library();
        Book book1 = new Book("Title1", "Author1", "ISBN1", 2020, 2);
        lib.addbook(book1);
        Assert.assertEquals(book1, lib.getbookbyISBN("ISBN1"));
    }

    @Test
    void getstudentbyID() {
        Library lib = new Library();
        Student st = new Student(123, "John", "Doe", "Group1");
        lib.addstudent(st);
        Assert.assertEquals(st, lib.getstudentbyID(123));
    }
}