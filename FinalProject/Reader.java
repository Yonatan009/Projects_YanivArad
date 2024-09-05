package FinalProject;

import java.util.ArrayList;

/**
 * The {@link Reader} class represents a reader with characteristics such as id, name, and a list of read books.
 */
public class Reader {

    /**
     * ID - > The unique identifier for the reader.
     * Name - > The name of reader.
     * ReadBooks - > A dynamic list of titles of books read by the reader.
     */
    private int id;
    private String name;
    private ArrayList<String> readBooks;

    /**
     * Constructs -> Create a new Objects with this params.
     * @param id The id of reader (int).
     * @param name The name of the reader (String).
     */
    public Reader(int id,String name) {
        this.id = id;
        this.name = name;
        readBooks = new ArrayList<>();
    }
    /** Retrieves the id of reader.
     * @return The id of reader.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of reader.
     * @param id The id (int).
     */
    public void setId(int id) {
        this.id = id;
    }

    /** Retrieves the Reader name.
     * @return The Reader name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of reader.
     * @param name The name (String).
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Retrieves List of titles of books read by the reader.
     * @return List of titles of books read by the reader.
     */
    public ArrayList<String> getReadBooks() {
        return readBooks;
    }

    /**
     * Sets list of titles of books read by the reader.
     * @param readBooks (ArrayList)
     */
    public void setReadBooks(ArrayList<String> readBooks) {
        this.readBooks = readBooks;
    }

    /**
     * Adds a book title to the list of read books if it has not already been read.
     * If the book has already been read, a message is printed.
     * @param title The title of the book to be added.
     */
    public void readBooks(String title){
        if (readBooks.contains(title)){
            System.out.println("The book" + title + "has already been read");
        }
        readBooks.add(title);
    }
}
