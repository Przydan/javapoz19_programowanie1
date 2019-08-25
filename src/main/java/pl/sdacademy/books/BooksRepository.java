package pl.sdacademy.books;

import java.util.List;

public interface BooksRepository {
    List<Book> findAll();

    /* List<Book> findByNation(Nation nation); */

    List<Book> findByAfterReleaseYear(int releaseYear);

    List<Book> searchByPhrase(String phrase);

    List<Book> searchByAuthor(String authorPhrase);
}
