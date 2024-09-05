package FinalProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Library - > Manages the collection of shelves and readers in the library.
 */

public class Library {

    private List<Shelf> shelves;
    private List<Reader> readers;

    /**
     * Constructs a new {@link Library} with initialized shelves and readers.
     */

    public Library() {
        shelves = new ArrayList<>();
        readers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            shelves.add(new Shelf());
        }
    }
    /**
     * Retrieves the list of shelves in the library.
     * @return The list of shelves.
     */
    public List<Shelf> getShelves() {
        return shelves;
    }
    /**
     * Sets the list of shelves in the library.
     * @param shelves The list of shelves to set.
     */
    public void setShelves(List<Shelf> shelves) {
        this.shelves = shelves;
    }
    /**
     * Retrieves the list of readers registered in the library.
     * @return The list of readers.
     */
    public List<Reader> getReaders() {
        return readers;
    }
    /**
     * Sets the list of readers registered in the library.
     * @param readers The list of readers to set.
     */
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    /**
     * Checks if there is space for a new book on any shelf.
     * @return True if there is space for a new book, false otherwise.
     */
    public Boolean  isTherePlaceForNewBook(){
        for (Shelf shelf: shelves){
                if(!shelf.isShelfFull()){
                    return true;
                }
            }
            return false;
        }

    /**
     * Adds a new book to the first available shelf with space.
     * @param book The book to add.
     */
    public void addNewBook(Book book){
        for(Shelf shelf : shelves){
            if(!shelf.isShelfFull()){
                shelf.addBook(book);
                return;
            }
        }
        System.out.println("no more space in shelf please wait until shelf be empty again");
    }

    /**
     * Deletes a book with the specified title from the library.
     * @param title The title of the book to delete.
     */
    public void deleteBook(String title){
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    shelf.getBooks().remove(book);
                    System.out.println("The " + book.getTitle() + " removed");
                    return;
                }
            }
        }
        System.out.println("Not found a book with this title");
    }
    /**
     * Registers a new reader with the specified id and name.
     * @param id The id of the reader.
     * @param name The name of the reader.
     */
    public void registerReader(int id, String name) {
        Reader reader = new Reader(id, name);
            if (reader.getId() == id) {
                System.out.println("This id already exists");
            }readers.add(reader);
    }
    /**
     * Removes a reader with the specified name from the list of readers.
     * @param name The name of the reader to remove.
     */
    public void removeReader(String name){
        for (Reader reader : readers){
            if(reader.getName().contains(name)){
                readers.remove(reader);
                System.out.println("The "+ reader.getName()  + " removed from list");
                return;
            }
        }
        System.out.println("Not found reader with this name");
    }

    /**
     * Searches for books by the specified author.
     * @param authorName The name of the author.
     * @return A list of book titles by the specified author.
     */
    public List<String> searchByAuthor(String authorName){
        boolean found = false;
        List<String> titles = new ArrayList<>();
        for (Shelf shelf : shelves){
            for (Book book : shelf.getBooks()){
                if(book.getAuthor().equalsIgnoreCase(authorName)){
                    titles.add(book.getTitle());
                    System.out.println("The " + book.getTitle() + " founded");
                    found = true;
                }
            }
        }if(!found){
            System.out.println("Not found author Name books");
        }
        return titles;
    }
}

