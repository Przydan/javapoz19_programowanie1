package pl.sdacademy.excercises.lambda;

public class LambdaExcercises {
    public static void main(String[] args) {

        LambdaInterface dodaj = (a, b) -> a + b;
        LambdaInterface odejmij = (a, b) -> a - b;

        System.out.println(dodaj.oblicz(4,5));
        System.out.println(odejmij.oblicz(4,5));


    }
}
