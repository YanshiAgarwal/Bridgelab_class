package Object_Modeling;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibrary() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) {
            b.showBook();
        }
    }
}

public class Library_and_books { 
	
    public static void main(String[] args) {
    	
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1); 
        l1.addBook(b2);

        l2.addBook(b2);
        l2.addBook(b3);

        l1.showLibrary();
        l2.showLibrary();
    }
}

