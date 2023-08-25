import java.util.Scanner;

class Library1 {
        String[] books = new String[100];
        ;
        int no_of_books = 0;


//    public Library() {      //USING CONSTRUCTOR
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }

        Scanner sc = new Scanner(System.in);
        public void addBooks() {
            System.out.print("How Much Books You Want To Add In Library : ");
            int ad = sc.nextInt();

            for (int i = 0; i < ad; i++) {

                System.out.print("Name Of The Books Please : ");
                String book = sc.next();
                this.books[no_of_books] = book;
                no_of_books++;

            }
            System.out.println(ad+ " Book(s) has been added!");
        }


        public void showAvailableBooks() {
            for (String book : this.books) {
                if (book == null) {
                    continue;

                }
                System.out.println("Available Books : " + book);
            }
        }

        void issueBook() {
            System.out.print("Which book you want to issue : ");
            int book;
            book = sc.nextInt();
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
            addBooks();
        }

    }

public class Library_Management_System_UserINPUT {
        public static void main(String[] args) {
            // You have to implement a library using Java Class "Library"
            // Methods: addBook, issueBook, returnBook, showAvailableBooks
            // Properties: Array to store the available books,
            // Array to store the issued books

            Library1 centrallibrary = new Library1();

            System.out.println("\n");
            centrallibrary.addBooks();

            System.out.println("\n");

            centrallibrary.showAvailableBooks();
            System.out.println("\n");

            centrallibrary.issueBook();
            System.out.println("\n");

            centrallibrary.showAvailableBooks();
            centrallibrary.returnBook("RETURNED : Rich Dad Poor Dad");
            centrallibrary.showAvailableBooks();

        }
    }


