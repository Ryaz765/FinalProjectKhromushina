package FinalProjectKhromushina;


import java.util.ArrayList;

public class Reader {

    String name;

    ArrayList<String> readerBooks;

    int id;


    Reader(String n, int id) {

        this.name = n;

        this.readerBooks = new ArrayList<>();

        this.id = id;

    }


    public Reader(int id, String name) {

        this.name = name;

        this.id = id;

    }


    public void readBook(String bookTitle) {

        readerBooks.add(bookTitle);

        System.out.println(readerBooks);

    }

    public int getId() {

        return id;

    }


    public String getName() {

        return name;

    }
}