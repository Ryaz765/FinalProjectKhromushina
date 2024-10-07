package FinalProjectKhromushina;






public class Shelf {



    private boolean isShelfFull;

    private Book [] books; // - books (a list of Maximum 5 Book objects)





    public Shelf () {

        isShelfFull = false;

        books = new Book[5];

    }



    public void addBook(Book newBook) {

        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) { // Check for the first empty spot

                books[i] = newBook;  // Add the new book



                if (i == books.length - 1) { // Last position filled, so shelf is full

                    isShelfFull = true;

                }

                return;

            }

        }



        System.out.println("The shelf is full. Cannot add more books.");

    }



    public void replaceBooks(int ind1, int ind2) {

        ind1--;

        ind2--;



        if (ind1 < 1 || ind1 > 5 || ind2 < 1 || ind2 > 5) {

            System.out.println("Please provide values between 1 and 5.");

            return;

        }



        if (books[ind1] == null) {

            System.out.println("This location is empty. Please provide another number.");

        }

        if (books[ind2] == null) {

            System.out.println("This location is empty. Please provide another number.");

        }



        Book t = books[ind1];

        books[ind1] = books[ind2];

        books[ind2] = t;



        System.out.println("Books at position " + (ind1 + 1) + " and " + (ind2 + 1) + " have been replaced.");

    }



    public Book[] getBooks() {

        return books;

    }



    public boolean isShelfFull() {

        return isShelfFull;

    }



    //

    public void setShelfFull(boolean isShelfFull) {

        this.isShelfFull = isShelfFull;

    }

}