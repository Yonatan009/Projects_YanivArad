package FinalProject;

import java.util.List;
import java.util.Scanner;

/**
 * The Main class initializes the library, pre-fills it with books, and provides the user interface for managing the library.
 */
public class Main {

    /**
     * Main method to start the program.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Constructor for the Main class.
     * Initializes the Library with predefined books and starts the user interaction.
     */
    public Main() {
        Library library = new Library();
        Book book1 = new Book("Yonatan1","Book1",100);
        Book book2 = new Book("Yonatan2","Book2",100);
        Book book3 = new Book("Yonatan3","Book3",100);
        Book book4 = new Book("Yonatan4","Book4",100);
        Book book5 = new Book("Yonatan5","Book5",100);
        Book book6 = new Book("Yonatan6","Book6",100);
        Shelf shelf1 = library.getShelves().get(0);
        Shelf shelf2 = library.getShelves().get(1);
        Shelf shelf3 = library.getShelves().get(2);
        shelf1.addBook(book1);
        shelf1.addBook(book2);
        shelf2.addBook(book3);
        shelf2.addBook(book4);
        shelf3.addBook(book5);
        shelf3.addBook(book6);
        start(library);
    }

    /**
     * Menu options for the user.
     */
    String manu = """
            • - “For adding a book - Press 1”.
            • - “For deleting a book - Press 2”.
            • - “For registering a new reader - Press 3”.
            • - “For removing a reader - Press 4”.
            • - “For searching books by author – Press 5.”
            • - “For exit – Press 6”.
            """;

    /**
     * Starts the user interaction with the library system.
     * Displays a menu and handles user input in an infinite loop until the user chooses to exit.
     * @param library The library object being managed.
     */
    private void start(Library library) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(manu);
            try {
                // Get user choice
                System.out.println("Enter your choice (1/2/3/4/5/6): ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        // Add a new book
                        System.out.println("Enter author:");
                        String author = scanner.nextLine();
                        System.out.println("Enter title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter number of pages:");
                        int numOfPages = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        Book book = new Book(author, title, numOfPages);
                        library.addNewBook(book);
                        break;
                    case 2:
                        // Delete a book by title
                        System.out.println("Enter the title of the book to delete:");
                        String bookTitle = scanner.nextLine();
                        library.deleteBook(bookTitle);
                        break;
                    case 3:
                        // Register a new reader
                        System.out.println("Enter reader's ID:");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.println("Enter reader's name:");
                        String name = scanner.nextLine();
                        library.registerReader(id,name);
                        break;
                    case 4:
                        // Remove a reader by name
                        System.out.println("Enter reader's to remove name:");
                        String readerName = scanner.nextLine();
                        library.removeReader(readerName);
                        break;
                    case 5:
                        // Search books by author
                        System.out.println("Enter author's name:");
                        String searchAuthor = scanner.nextLine();
                        List<String>temp = library.searchByAuthor(searchAuthor);
                        System.out.println(temp);
                        break;
                    case 6:
                        // Exit the program
                        System.out.println("Exiting...");
                        return;
                    default:
                        // Handle invalid choices
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                // Handle errors
                System.out.println("Error " + e);
            }
        }
    }
}

