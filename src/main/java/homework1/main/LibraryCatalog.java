package homework1.main;

import homework1.model.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    public static List<Book> books; //composition

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    public static void listBooks() {
        System.out.println("The list of books is:");
        if (books.size() == 0) {
            System.out.println("    # EMPTY");
        }
        for (Book b : books) { //polymorphism
            System.out.println("    # " + b);
        }
    }

    public static void addBooks(Book book) { //polymorphism
        books.add(book);
        String getClass = " " + book.getClass();
        String typeOfBook = getClass.substring(getClass.indexOf("." ) + 7);
        System.out.println("Book of type '" + typeOfBook + "' has been added to the Library --> # " + book);
    }

    public static void deleteBooks(Book book) { //polymorphism
        books.remove(book);
        System.out.println("Book has been deleted from the Library --> # " + book);
    }

    public static void main(String... args) {
        Book book = new Book("Ion", 100);
        Novel nov = new Novel("Vulpea", 99, "poveste");
        Novel nov1 = new Novel(book.getName(), book.getNoOfPages(), "roman");
        ArtAlbum artA = new ArtAlbum("Album1", 10, "best");

//        System.out.println("book --> " + book);
//        System.out.println("nov --> " + nov);
//        System.out.println("nov1 --> " + nov1);
//        System.out.println("artA --> " + artA);

        System.out.println("*************************** This is a Library Catalog ***************************");
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        libraryCatalog.listBooks(); //polymorphism
        libraryCatalog.addBooks(book); //polymorphism
        libraryCatalog.addBooks(nov); //polymorphism
        libraryCatalog.addBooks(nov1); //polymorphism
        libraryCatalog.addBooks(artA); //polymorphism

        libraryCatalog.listBooks();

        libraryCatalog.deleteBooks(book); //polymorphism
        libraryCatalog.listBooks();
    }
}
