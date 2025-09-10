package This_static_final_instanceof;

class Book {
    static String libraryName = "City Library";   // static variable
    
    String title;
    String author;
    final String isbn;   // final variable

    Book(String title, String author, String isbn) {
        // using this to assign instance variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void showDetails() {
        // instanceof check before displaying
        if (this instanceof Book) {
            System.out.println("Book: " + title + " , Author: " + author + " , ISBN: " + isbn);
        }
    }
}

public class Library_management_system {
    public static void main(String[] args) {
        // static method call
        Book.displayLibraryName();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN101");
        Book b2 = new Book("1984", "George Orwell", "ISBN102");

        b1.showDetails();
        b2.showDetails();
    }
}

