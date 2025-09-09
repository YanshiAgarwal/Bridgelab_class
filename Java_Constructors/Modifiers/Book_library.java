package Modifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title +
                           ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

public class Book_library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.6);

        // Display details
        ebook.display();

        // Update author using setter
        ebook.setAuthor("J. Bloch");

        System.out.println("\nAfter updating author:");
        ebook.display();

	}

}
