// Question:
//
// Given an integer array, find the maximum difference
// between two elements where the larger element comes
// after the smaller element.
//
// Example:
// [7, 1, 5, 3, 6, 4]
// Output: 5
//
// Because 6 - 1 = 5

public class MaximumDifference {

    public static int findDifference(int[] numbers) {

        int smallest = numbers[0];
        int maximumDifference = 0;

        for (int i = 1; i < numbers.length; i++) {

            int difference = numbers[i] - smallest;

            if (difference > maximumDifference) {
                maximumDifference = difference;
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return maximumDifference;
    }

    public static void main(String[] args) {

        int[] numbers = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Difference: "
                + findDifference(numbers));
    }
}