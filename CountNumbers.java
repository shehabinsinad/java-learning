// Question:
//
// Given an integer array, count how many positive,
// negative, and zero values it contains.
//
// Example:
// [2, -4, 0, 5, -1, 0]
//
// Positive: 2
// Negative: 2
// Zero: 2

public class CountNumbers {

    public static void countValues(int[] numbers) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int number : numbers) {

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }

    public static void main(String[] args) {

        int[] numbers = {2, -4, 0, 5, -1, 0};

        countValues(numbers);
    }
}