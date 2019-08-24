package pl.sdacademy.books;

import java.util.List;
import java.util.Scanner;

public class BooksViews {
    // klasa ze skanerem
    private Scanner scanner;

    public BooksViews(Scanner scanner) {
        this.scanner = scanner;
    }

    public int startMenu() {
        System.out.println("1. Authors ");
        System.out.println("2. Books ");
        System.out.println("0. Koniec ");
        return getDecisionAfterEnter();
    }

    public int authorsMenu(List<Author> authors) {
        authors.forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1. Find by nation (PL, ENG, USA)"); //TODO zrobić to dynamicznie
        System.out.println("2. Find by after birthYear");
        System.out.println("0. Back");
        return getDecision();
    }

    public int booksMenu(List<Book> books) {
        books.forEach(book -> System.out.println(book));
        System.out.println("1. Find by after release year");
        System.out.println("2. Search by title");
        System.out.println("3. Search by author");
        System.out.println("0. Back");
        return getDecision();
    }

    public int getDecision() {
        return scanner.nextInt();
    }

    public Nation getNation() {
        String nationAsString = scanner.nextLine().toUpperCase();
        //sprawdzenie
        System.out.println("Wpisany string" + nationAsString);
        try {

            return Nation.valueOf(nationAsString);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return null;
    }

    public int getBirthYear() {
        return readIntAndClearLine();
    }

    private int getDecisionAfterEnter() {
        return readIntAndClearLine();
//        int menu = scanner.nextInt();
//        scanner.nextLine(); // istotne że tu to jest
//        return menu;
        //
    }

    public int getReleaseYear() {
        return readIntAndClearLine();
    }

    private int readIntAndClearLine() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getPhrase() {
        return scanner.nextLine().trim();
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello Whats your name");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//        System.out.println("");
//    }
}
