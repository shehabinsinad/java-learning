// Question:
//
// Given an integer array, print all numbers that
// appear exactly once.
//
// Example:
// [1, 2, 2, 3, 4, 4, 5]
//
// Output:
// 1 3 5

public class UniqueNumbers {

    public static void printUnique(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        printUnique(numbers);
    }
}