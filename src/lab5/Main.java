package lab5;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner in = new Scanner(System.in);
        int menu = -1;
        while (menu != 7) {
            System.out.println("Select the program:");
            System.out.println("1.Add book");
            System.out.println("2.Add student");
            System.out.println("3.Assign a book to student");
            System.out.println("4.Remove a book from particular student");
            System.out.println("5.Print information about all books and students in Library");
            System.out.println("6.Print all books that's currently assigned to a student");
            System.out.println("7.Exit");
            switch (in.nextInt()) {
                case 1 -> {
                    System.out.println("1.Add title");
                    String title = in.next();
                    System.out.println("2.Add author");
                    String author = in.next();
                    System.out.println("3.Add isbn");
                    String isbn = in.next();
                    System.out.println("4.Add year");
                    int year = in.nextInt();
                    System.out.println("5.Add quantity");
                    int quantity = in.nextInt();
                    Book newbook = new Book(title, author, isbn, year, quantity);
                    System.out.println(newbook);
                    lib.addbook(newbook);
                }
                case 2 -> {
                    System.out.println("1.Add ID");
                    int ID = in.nextInt();
                    System.out.println("2.Add name");
                    String name = in.next();
                    System.out.println("3.Add surname");
                    String surname = in.next();
                    System.out.println("3.Add group");
                    String group = in.next();
                    Student student = new Student(ID, name, surname, group);
                    System.out.println(student);
                    lib.addstudent(student);
                }
                case 3 -> {
                    System.out.println("Assigning a book to student ");
                    System.out.println("Choose a book by ISBN");
                    if (!lib.books.isEmpty()) {
                        for (Book book : lib.books) {
                            System.out.println(book);
                        }
                    }
                    String booktoAdd = in.next();
                    System.out.println("Choose a student by ID");
                    if (!lib.students.isEmpty()) {
                        for (Student student1 : lib.students) {
                            System.out.println(student1);
                        }
                    }
                    int studenttoAdd = in.nextInt();
                    lib.getstudentbyID(studenttoAdd).giveBook(lib.getbookbyISBN(booktoAdd));
                }
                case 4 -> {
                    System.out.println("Remove a book from a student");
                    System.out.println("Choose a student by ID");
                    if (!lib.students.isEmpty()) {
                        for (Student student1 : lib.students) {
                            System.out.println(student1);
                        }
                    }
                    int studenttoRemoveFrom = in.nextInt();
                    System.out.println("Choose a book by ISBN");
                    System.out.print(lib.getstudentbyID(studenttoRemoveFrom).allbooks());
                    String booktoRemove = in.next();
                    lib.getstudentbyID(studenttoRemoveFrom).removeBook(lib.getbookbyISBN(booktoRemove));
                }
                case 5 -> {
                    System.out.println("Information about all books and students");
                    System.out.println("All books");
                    for (Book book : lib.books) {
                        System.out.println(book);
                    }
                    System.out.println("All students");
                    for (Student student1 : lib.students) {
                        System.out.println(student1);
                    }
                }
                case 6 -> {
                    System.out.println("Information about all books that assigned to student");
                    System.out.println("Choose a student by ID");
                    if (!lib.students.isEmpty()) {
                        for (Student student1 : lib.students) {
                            System.out.println(student1);
                        }
                    }
                    int studenttolistBooks = in.nextInt();
                    if (!lib.getstudentbyID(studenttolistBooks).borrowedBooks.isEmpty()) {
                        for (Book book : lib.getstudentbyID(studenttolistBooks).borrowedBooks) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("No books");
                    }
                }
                case 7 -> {
                    in.close();
                    System.exit(0);
                }
            }
        }
    }
}
