package FinalProject;

/**
 * The {@link  Book} class represent a book with this characteristics author, title, numOfPages.
 */
public class Book {
    /**
     * The author name of books.
     * The title of books.
     * The total number of pages in books.
     */
    private String author;
    private String title;
    private int numOfPages;

    /**
     * Constructs -> Create a new Objects with this params.
     * @param author The author's name (String).
     * @param title The title (String).
     * @param numOfPages The numOfPages (int).
     */
    public Book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    /** Retrieves the author name for this book.
     * @return The author's name.
     */
    public String getAuthor() {
        return author;
    }

    /** Retrieves the title of the book.
     * @return The Book title.
     */
    public String getTitle() {
        return title;
    }

    /** Retrieves total number of pages in book.
     * @return The number of pages in book.
     */
    public int getNumOfPages() {
        return numOfPages;
    }

    /**
     * Sets the author's name for this book.
     * @param author The author's name (String).
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the total number of pages in the book.
     * @param numOfPages The number of pages in the book.
     */
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    /**
     * Sets the title of the book.
     * @param title The book's title (String).
     */
    public void setTitle(String title) {
        this.title = title;
    }

}