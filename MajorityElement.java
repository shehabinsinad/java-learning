// Question:
//
// Given an integer array, find the element that appears
// more than half of the time.
//
// Example:
// [2, 2, 1, 1, 1, 2, 2]
//
// Output:
// 2
//
// Assume that a majority element always exists.

public class MajorityElement {

    public static int findMajority(int[] numbers) {

        int candidate = numbers[0];
        int count = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = numbers[i];
                count = 1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: "
                + findMajority(numbers));
    }
}