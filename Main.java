package FinalProjectKhromushina;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();



        Shelf shelf1 = new Shelf();



        Book book1 = new Book("Tolstoy", "Voyna", 624);

        Book book2 = new Book("Tolstoy", "AnnaKarenina", 628);



        library.addNewBook(book1);

        shelf1.addBook (book1);

        library.addNewBook(book2);

        shelf1.addBook (book2);



        Shelf shelf2 = new Shelf();



        Book book3 = new Book("Bulgakov", "MasteriMargarita", 123);

        Book book4 = new Book("Bulgakov", "SobachyeSerdce", 232);





        library.addNewBook(book3);

        shelf2.addBook (book3);

        library.addNewBook(book4);

        shelf2.addBook (book4);



        Shelf shelf3 = new Shelf();



        Book book5 = new Book("Bunin", "Dni", 456);

        Book book6 = new Book("Fowles", "Magus", 356);



        library.addNewBook(book5);

        shelf3.addBook (book5);

        library.addNewBook(book6);

        shelf3.addBook (book6);



        Scanner scanner = new Scanner(System.in);

        boolean exit = false;



        while (!exit) {

            // Display menu options

            System.out.println("For adding a book - Press 1");

            System.out.println("For deleting a book - Press 2");

            System.out.println("For registering a new reader - Press 3");

            System.out.println("For removing a reader - Press 4");

            System.out.println("For searching books by author – Press 5");

            System.out.println("For exit – Press 6");





            int choice = scanner.nextInt();



            switch (choice) {

                case 1:

                    System.out.println("Please enter the author of the book");

                    String authorBook = scanner.next();

                    System.out.println("Please enter the title of the book");

                    String nameBook = scanner.next();

                    System.out.println("Please enter the number of pages of the book");

                    int nop = scanner.nextInt();



                    Book book10 = new Book(authorBook, nameBook, nop);

                    library.addNewBook(book10);



                    break;

                case 2:

                    System.out.println("Please enter the book title to be removed");

                    String bookTitle = scanner.next();



                    library.deleteBook(bookTitle);



                    break;

                case 3:

                    System.out.println("Please enter the name of new reader");

                    String readerName = scanner.next();

                    System.out.println("Please enter his/her id");

                    int id = scanner.nextInt();

                    library.registerReader(readerName, id);



                    break;

                case 4:

                    System.out.println("Please enter the name of reader to be removed");

                    String readerName2 = scanner.next();



                    library.removeReader(readerName2);



                    break;

                case 5:

                    System.out.println("Please enter the author's name");

                    String authorName = scanner.next();



                    library.searchByAuthor(authorName);



                    break;

                case 6:

                    exit = true;

                    break;

                default:

                    System.out.println("Please enter a number from 1 to 6");

                    break;

            }



        }

    }

}