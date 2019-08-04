package pl.sdacademy.books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();
}
