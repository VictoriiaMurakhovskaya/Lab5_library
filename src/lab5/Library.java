package lab5;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public Library() {
    }

    public void addbook(Book book){
        if (books.isEmpty()){
            books = new ArrayList<>();
        }
        books.add(book);

    }

    public void addstudent(Student student){
        students.add(student);
    }


    public Book getbookbyISBN(String ISBN) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.isbn.equals(ISBN)) {
                    return book;
                }
            }
        }
        return null;
    }

    public Student getstudentbyID(int ID){
        if (!students.isEmpty()) {
            for (Student student1 : students) {
                if (student1.ID == ID) {
                    return student1;
                }
            }
        }
        return null;
    }

    public String toString(){
        return "Books: " + books + ", Students: " + students;
    }
}
