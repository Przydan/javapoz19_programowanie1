package pl.sdacademy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.sdacademy.Nation.PL;
import static pl.sdacademy.Nation.USA;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class ApplicationBook {
    public static void main(String[] args) {


        List<Author> authors = Arrays.asList(
                new Author("Stephen", "King", 1947, Nation.USA),
                new Author("Henryk", "Sienkiewicz", 1846, Nation.PL),
                new Author("Adam", "Mickiewicz", 1798, Nation.PL),
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG)
        );


        List<Book> books = Arrays.asList(
                new Book("W pustyni i w puszczy", 1910, 300, authors.get(1)),
                new Book("Krzyżacy", 1900, 1000, authors.get(1)),
                new Book("Dziady III", 1832, 250, authors.get(2)),
                new Book("Dziady I", 1860, 350, authors.get(2)),
                new Book("Zielona mila", 1996, 290, authors.get(0)),
                new Book("Balladyn", 1839, 400, authors.get(3)),
                new Book("Harry Potter i Czara ognia", 2005, 650, authors.get(4)),
                new Book("Harry Potter i Ksiaze Polkrwi", 2009, 650, authors.get(4)),
                new Book("Romeo i Julia", 1595, 340, authors.get(5))
        );

        // wyświetlić liste ksiażek za pomocą lambd/stream api

        books.stream()
                .filter(book -> book.getReleaseYear() < 2000)
                .filter(book -> book.getPages() > 300)
                //.forEach(book -> System.out.println(book))
                .map(book -> book.getTitle())
                .forEach(bookTitle -> System.out.println(bookTitle));

        System.out.println(books.stream()
                .mapToInt(book -> book.getPages())
                .sum() / (double) books.size());

        System.out.println("Henryk Sienkiewicz");
        findsBooksByAuthor(books, authors.get(1));
        System.out.println("Joanne Murray Rowling ");
        findsBooksByAuthor(books, authors.get(4));


//// Przykład wykorzystania lambd
//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//// Lambda - implementacja klasy anonimowej.
//        integers.stream()
//                .filter(n -> n % 2 == 0) // filtracja
//                .filter(n -> n > 5)
//                .filter(n -> n < 10)
//                .map(n -> n * 2) // każdy element zmodyfikować i stworzyć nowy strumień
//                .map(n -> n % 3 == 0 ? "Podzielne przez 3" : "nie podzielne przez trzy") // inta mapujemy na stringa i tu nam się stworzy strumień stringów
//                .collect(Collectors.toList()) // wrzucenie do listy
//                .forEach(System.out::println);  // forEach(n -> System.out.println(n)) // forEach konsumuje strumień, nie tworzy nowych stumieni

//
//        integers.stream()
//                .filter(new Predicate<Integer>() { // klasa anonimowa
//                    @Override
//                    public boolean test(Integer integer) {
//                        return false;
//                    }
//                });

    }

    public static void findsBooksByAuthor(List<Book> books, Author author) {
        //funkcja wypisująca książki danego autora
        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .forEach(book -> System.out.println(book));
    }
}
