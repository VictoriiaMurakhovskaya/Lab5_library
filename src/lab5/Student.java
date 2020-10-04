package lab5;

import java.util.ArrayList;

public class Student {
    int ID;
    String name;
    String surname;
    String group;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student() {
        ID = 0;
        name = null;
        surname = null;
        group = null;
        borrowedBooks = null;
    }

    public Student(int newID, String newname, String newsurname, String newgroup) {
        ID = newID;
        name = newname;
        surname = newsurname;
        group = newgroup;
    }

    public void giveBook(Book book){
        borrowedBooks.add(book);
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Surname: " + surname + ", group: " + group;
    }

    public String allbooks() {
        StringBuilder res = new StringBuilder();
        for (Book book : borrowedBooks){
            res.append(book.toString()).append('\n');
        }
    return res.toString();
    }

    public void removeBook(Book book){
        borrowedBooks.remove(book);
    }
}

