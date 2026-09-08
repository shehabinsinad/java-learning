// Question:
//
// Given an integer array, find the smallest element.
//
// Example:
// [8, 3, 6, 1, 9]
// Output: 1

public class MinimumElement {

    public static int findMinimum(int[] numbers) {

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {

        int[] numbers = {8, 3, 6, 1, 9};

        System.out.println("Minimum: "
                + findMinimum(numbers));
    }
}