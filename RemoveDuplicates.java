// Question:
//
// Given an integer array, print the values without duplicates.
//
// Example:
// [1, 2, 2, 3, 4, 4, 5]
// Output:
// 1 2 3 4 5

public class RemoveDuplicates {

    public static void printUnique(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        printUnique(numbers);
    }
}