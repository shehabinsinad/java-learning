// Question:
//
// Given an integer array, find the largest element.
//
// Example:
// [4, 7, 2, 9, 5]
// Output: 9

public class LargestElement {

    public static int findLargest(int[] numbers) {

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 7, 2, 9, 5};

        System.out.println("Largest: " + findLargest(numbers));
    }
}