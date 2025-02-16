package pl.sdacademy.books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();

    List<Author> findByNation(Nation nation);

    List<Author> findAfterBirthYear(int birthYear);
}
