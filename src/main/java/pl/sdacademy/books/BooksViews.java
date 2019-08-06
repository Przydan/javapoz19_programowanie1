package pl.sdacademy.books;

import pl.sdacademy.Nation;

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
        authors.stream()
                .forEach(author -> System.out.println(author));
        System.out.println();
        System.out.println("1. Find by nation (PL, ENG, USA)"); //TODO zrobić to dynamicznie
        System.out.println("2. Find by after birthYear");
        System.out.println("0. Wróć");
        return getDecision();
    }

    public int getDecision() {
        return scanner.nextInt();
    }

    public Nation getNation() {
        String nationAsString = scanner.nextLine();
        return Nation.valueOf(nationAsString);
    }

    private int getDecisionAfterEnter() {
        int menu = scanner.nextInt();
        scanner.nextLine(); // istotne że tu to jest
        return menu;
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello Whats your name");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//        System.out.println("");
//    }
}
