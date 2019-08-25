package pl.sdacademy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> maleNames = Arrays.asList("Pawel", "Piotr", "Tomasz");
        List<String> femaleNames = Arrays.asList("Patrycja", "Anna", "Karolina");



        for (int i = 0; i < 10; i++) {

            Stream.of(maleNames, femaleNames) // strumień dwóch elementów
                    .flatMap(e -> e.stream()) // e jest to lista
                    .filter(name -> name.toLowerCase().startsWith("p"))
                    .sorted((a, b) -> new Random().nextInt(2) - 1) // (a, b) comparator
                    .findAny()
                    .ifPresent(name -> System.out.println(name));
        }
    }
}
