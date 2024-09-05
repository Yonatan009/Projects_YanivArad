package FinalProject;

import java.util.ArrayList;

/**
 * The {@link Shelf} class represents a shelf that holds books.
 */

public class Shelf {

    /**
     * A list of books on the shelf.
     * private ArrayList<Book> books;
     * Indicates whether the shelf is full.
     */

    private ArrayList<Book> books;
    private boolean isShelfFull;

    /**
     * Constructs a new {@link Shelf} with an empty list of books and the shelf not full.
     */
    public Shelf() {
        this.books = new ArrayList<>();
        this.isShelfFull=false;
    }

    /**
     * Adds a book to the shelf. If the shelf is full, prints a message and does not add the book.
     * @param book The book to add.
     */
    public void addBook(Book book)  {
        if(isShelfFull){
            System.out.println("The shelf is full!");
            return;
        }
        books.add(book);
        if(books.size()==5){
            isShelfFull=true;
        }
    }

    /**
     * Replaces books at the specified positions on the shelf.
     * @param bookNumber1 The position of the first book to replace (1-based index).
     * @param bookNumber2 The position of the second book to replace (1-based index).
     */
    public void replaceBooks(int bookNumber1,int bookNumber2){
        if(bookNumber1 < 1 || bookNumber1>5 || bookNumber2 < 1 || bookNumber2 >5) {
            System.out.println("please enter valid number!!!");
        }
        else if(books.get(bookNumber1 - 1) == null || books.get(bookNumber2 - 1) == null){
            System.out.println("You are trying to replace with a book that does not exist on the page!");
        }else{
            Book temp = books.get(bookNumber1-1);
            books.set(bookNumber1 -1, books.get(bookNumber2-1));
            books.set(bookNumber2 - 1,temp);
        }

    }

    /**
     * Retrieves the list of books on the shelf.
     * @return The list of books.
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Sets the list of books on the shelf.
     * @param books The list of books to set.
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * Checks if the shelf is full.
     * @return True if the shelf is full, false otherwise.
     */
    public boolean isShelfFull() {
        return isShelfFull;
    }

    /**
     * Sets the shelf's full status.
     * @param shelfFull True if the shelf should be marked as full, false otherwise.
     */
    public void setShelfFull(boolean shelfFull) {
        isShelfFull = shelfFull;
    }
}
