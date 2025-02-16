package pl.sdacademy.books;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryAuthorsRepository implements AuthorsRepository {

    private List<Author> authors;

    public InMemoryAuthorsRepository() {
        this.authors = new ArrayList<>();
        init();
    }

    @Override
    public List<Author> findAll() {
        return new ArrayList<>(authors); // przekazać kopie,
    }

    @Override
    public List<Author> findByNation(Nation nation) {
        //TODO zapisać w lambdzie
        return authors.stream()
                .filter(author -> author.getNation().equals(nation))
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> findAfterBirthYear(int birthYear) {
        return authors.stream()
                .filter(author -> author.getBirthYear() >= birthYear)
                .collect(Collectors.toList());
    }

    private void init() {
        authors.add(new Author("Stephen", "King", 1947, Nation.USA));
        authors.add(new Author("Henryk", "Sienkiewicz", 1846, Nation.PL));
        authors.add(new Author("Adam", "Mickiewicz", 1798, Nation.PL));
        authors.add(new Author("Juliusz", "Słowacki", 1849, Nation.PL));
        authors.add(new Author("Joanne Murray", "Rowling", 1965, Nation.ENG));
        authors.add(new Author("William", "Shakespeare", 1564, Nation.ENG));
    }
}
