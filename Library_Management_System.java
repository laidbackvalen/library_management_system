import java.util.Scanner;

class Library {
    String[] books = new String[100];
    ;
    int no_of_books = 0;

//    public Library() {      //USING CONSTRUCTOR
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }

    public void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("Recently Added : " + book + " has been added!");

    }

    public void showAvailableBooks() {
        for (String book : this.books) {
            if (book == null) {
                continue;

            }
            System.out.println("Available Books : " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " Has Been Issued...");
                this.books[i] = null;
                return;

            }
        }
        System.out.println("this book doesn't exist");
    }

    void returnBook(String book) {
        addBooks(book);
    }

}

public class Library_Management_System {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centrallibrary = new Library();

        System.out.println("\n");
        centrallibrary.addBooks("Rich Dad Poor Dad");
        centrallibrary.addBooks("The Dhando Investor");
        centrallibrary.addBooks("Bhagvad Gita");
        centrallibrary.addBooks("Learn To Earn");
        System.out.println("\n");

        centrallibrary.showAvailableBooks();
        System.out.println("\n");

        centrallibrary.issueBook("Rich Dad Poor Dad");
        System.out.println("\n");

        centrallibrary.showAvailableBooks();
        System.out.println("\n");

        centrallibrary.returnBook("Rich Dad Poor Dad");
        System.out.println("\n");

        centrallibrary.showAvailableBooks();

    }
}
