package FinalProjectKhromushina;

import java.util.ArrayList;
import java.util.List;

public class Library {



    private List<Shelf> shelves;

    private List<Reader> readers;







    public Library() {

        shelves = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            shelves.add(new Shelf());

        }



        readers = new ArrayList<>();

    }



    public boolean isTherePlaceForNewBook() {

        for (Shelf shelf : shelves) {

            if (!shelf.isShelfFull()) {

                return true;

            }

        }

        return false;}



    public void addNewBook(Book newBook) {



        for (Shelf shelf : shelves) {



            if (!shelf.isShelfFull()) {



                shelf.addBook(newBook);

                return;

            }

        }

    }

    public void deleteBook(String title) {

        for (Shelf shelf : shelves) {

            for (int i = 0; i < shelf.getBooks().length; i++) {

                Book currentBook = shelf.getBooks()[i];



                if (currentBook != null && currentBook.getTitle().equalsIgnoreCase(title)) {

                    shelf.getBooks()[i] = null;

                    System.out.println("Book \"" + title + "\" has been deleted from the library.");



                    shelf.setShelfFull(false);

                    return;

                }

            }

        }

        System.out.println("Book \"" + title + "\" not found in the library.");

    }



    public void registerReader(String name, int id) {

        Reader newReader = new Reader(id, name);

        readers.add(newReader);

        System.out.println("Reader " + name + " has been registered with ID: " + id);

    }



    public void removeReader(String name) {

        for (Reader reader : readers) {

            if (reader.getName().equalsIgnoreCase(name)) {

                readers.remove(reader);

                System.out.println("Reader " + name + " has been removed from the library.");

                return;

            }

        }

        System.out.println("Reader " + name + " not found in the library.");

    }



    public List<String> searchByAuthor(String authorName) {

        List<String> titlesByAuthor = new ArrayList<>();

        for (Shelf shelf : shelves) {

            for (Book book : shelf.getBooks()) {

                if (book != null && book.getAuthor().equalsIgnoreCase(authorName)) {

                    titlesByAuthor.add(book.getTitle());

                }

            }

        }

        if (titlesByAuthor.isEmpty()) {

            System.out.println("No books found by author: " + authorName);

        } else {

            System.out.println("Books by " + authorName + ": " + titlesByAuthor);

        }

        return titlesByAuthor;

    }



}