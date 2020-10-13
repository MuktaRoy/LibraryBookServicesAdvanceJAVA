package main;


import model.LibraryBook;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.Iterator;


@Service
public class LibraryBookService {

    ArrayList<LibraryBook> libraryBookList = new ArrayList<LibraryBook>(Arrays.asList(
            new LibraryBook("1", "10", "Kids", "mukta", "IEEE", "220", "SEU"),
            new LibraryBook("2", "20", "lids", "chamak", "IAE", "250", "BUET"),
            new LibraryBook("3", "30", "Birds", "anu", "IEEE", "420", "SEU")


    ));

    public List<LibraryBook> getAllLibraryBooks() {
        return libraryBookList;
    }

    public LibraryBook getLibraryBook(final String indexNumber) {
        return libraryBookList.stream().filter(t -> t.getIndexNumber().equals(indexNumber)).findFirst().get();
    }

    public void addLibraryBook(LibraryBook libraryBook) {

        libraryBookList.add(libraryBook);
    }

    public void updateLibraryBook(LibraryBook book,String indexNumber) {

        for (int i = 0; i < libraryBookList.size(); i++) {
            LibraryBook libraryBook = libraryBookList.get(i);
            if (libraryBook.getIndexNumber().equals(indexNumber)) {

                libraryBookList.set(i, book);
            }
        }

    }

    public void deleteLibraryBook(LibraryBook libraryBook, String indexNumber) {

        libraryBookList.removeIf(t->t.getIndexNumber().equals(indexNumber));
    }
}

/*
   public LibraryBook getLibraryBook(final String indexNumber)
    {

   }



}
*/

