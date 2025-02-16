package pl.sdacademy.books;

import java.util.List;

public class BooksService {
    private BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }



    public List<Book> findByReleaseYear(int releaseYear) {
        return booksRepository.findByAfterReleaseYear(releaseYear);
    }

    public List<Book> searchByPhrase(String phrase) {
        return booksRepository.searchByPhrase(phrase);
    }

    public List<Book> searchByAuthor(String authorPhrase) {
        return booksRepository.searchByAuthor(authorPhrase);
    }
}
