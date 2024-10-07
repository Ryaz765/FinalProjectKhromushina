package FinalProjectKhromushina;


public class Book {

    String author;

    String title;

    int numOfPages;


    Book(String auth, String title, int nop) {

        this.author = auth;

        this.title = title;

        this.numOfPages = nop;

    }

    public String getAuthor() {

        return author;

    }

    public String getTitle() {

        return title;

    }



    public int getNumOfPages() {

        return numOfPages;

    }

}