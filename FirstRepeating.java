// Question:
//
// Given an integer array, find the first element
// that appears more than once.
//
// Example:
// [10, 5, 3, 4, 3, 5, 6]
//
// Output:
// 5
//
// 5 is the first element in the array that repeats.

public class FirstRepeating {

    public static int findFirstRepeating(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 5, 3, 4, 3, 5, 6};

        System.out.println(findFirstRepeating(numbers));
    }
}