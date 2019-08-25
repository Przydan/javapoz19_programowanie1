package pl.sdacademy.lists;

public class Search {
    public static void main(String[] args) {

    }

    public int binarySearch(int value, int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;


        while (left < right) {
            int center = (left + right) / 2;
            int midValue = numbers[center];

            if (midValue < value) {
                left = center + 1;
            } else if (midValue > value) {
                right = center - 1;
            } else {
                left = right = center;
            }
        }

        return value == numbers[left] ? left : -1;
    }
}
