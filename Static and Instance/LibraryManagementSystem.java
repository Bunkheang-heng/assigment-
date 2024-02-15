import java.util.ArrayList;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Patron {
    private int patronId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Patron(int patronId, String name) {
        this.patronId = patronId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void displayBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}

class Library {
    private static int totalBooks = 0;

    public static void addBook() {
        totalBooks++;
    }

    public static void removeBook() {
        if (totalBooks > 0) {
            totalBooks--;
        } else {
            System.out.println("No books available to remove.");
        }
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books available: " + totalBooks);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library.addBook();
        Library.addBook();
        Library.addBook();
        Library.displayTotalBooks();

        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book(2, "1984", "George Orwell");

        Patron patron1 = new Patron(101, "Alice");
        Patron patron2 = new Patron(102, "Bob");

        patron1.borrowBook(book1);
        patron1.borrowBook(book2);


        patron2.borrowBook(book1);

        patron1.displayBorrowedBooks();
        patron2.displayBorrowedBooks();
    }
}

