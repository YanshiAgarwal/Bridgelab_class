package This_static_final_instanceof;

class Book {
    static String libraryName = "City Library";   
    
    String title;
    String author;
    final String isbn;   

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void showDetails() {
        if (this instanceof Book) {
            System.out.println("Book: " + title + " , Author: " + author + " , ISBN: " + isbn);
        }
    }
}

public class Library_management_system {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN101");
        Book b2 = new Book("1984", "George Orwell", "ISBN102");

        b1.showDetails();
        b2.showDetails();
    }
}


