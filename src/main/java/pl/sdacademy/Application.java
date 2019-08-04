package pl.sdacademy;

import pl.sdacademy.books.Author;

import java.util.*;

import static pl.sdacademy.Nation.PL;
import static pl.sdacademy.Nation.USA;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world! ");

        Author author1 = new Author();
        Author author2 = new Author("Jan", "Kochanowski", 1530, PL);
        Author author3 = new Author("Andrzej", "Sapkowski", 1948, PL);
        Author author4 = new Author("Stephen", "King", 1943, USA);

        author1.setFirstName("Henryk");
        author1.setLastName("Sienkiewicz");
        author1.setBirthyear(1846);
        author1.setNation(PL);

        //List<Author> authors = Arrays.asList(author1, author2, author3, author4);

        List<Author> authors = Arrays.asList(author1, author2, author3, author4,
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));

        test(authors);


    }

    private static void test(List<Author> authors) {
        System.out.println("Show by nation");
        showByNation(authors, PL);
        System.out.println("Show modern authors");
        showModernAuthors(authors);
        System.out.println("Show by nation and birtyear");
        showByNationAndBirthYear(authors, USA, 1900);

        System.out.println(" Group by nation \n" + groupByNation(authors));
    }

    private static void showByNation(List<Author> authors, Nation nation) {
        for (Author author : authors) {
            if (author.getNation().equals(nation)) {
                System.out.println(author);
            }
        }
    }

    static void showModernAuthors(List<Author> authors) {
        for (Author author : authors) {
            if (author.getBirthyear() > 1900) {
                System.out.println(author);
            }
        }
    }

    static void showByNationAndBirthYear(List<Author> authors, Nation nation, int birthYear) {
        for (Author author : authors) {
            if (((author.getNation().equals(nation))) && (author.getBirthyear() > birthYear)) {
                System.out.println(author);
            }
        }
    }

    private static Map<Nation, List<Author>> groupByNation(List<Author> authors) {
        Map<Nation, List<Author>> map = new HashMap<>();

        for (Author author : authors) {
            map.putIfAbsent(author.getNation(), new ArrayList<>());
            map.get(author.getNation()).add(author);
        }
        return map;
    }

}
