package lab5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testToString() {
        Book book1 = new Book("Title1", "Author1", "ISBN1", 2020, 2);
        String expected = "Isbn: ISBN1, Title: Title1, Author: Author1, Year: 2020, Quantity 2";
        String actual = book1.toString();
        Assert.assertEquals(expected, actual);
    }
}