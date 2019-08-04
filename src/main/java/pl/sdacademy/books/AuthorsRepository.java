package pl.sdacademy.books;

import pl.sdacademy.Nation;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();

    List<Author> findByNation(Nation nation);
}
