// Question:
//
// An array contains numbers from 1 to n,
// but one number is missing. Find the missing number.
//
// Example:
// [1, 2, 4, 5, 6]
// Output: 3

public class MissingNumber {

    public static int findMissing(int[] numbers, int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};

        int n = 6;

        System.out.println("Missing Number: " + findMissing(numbers, n));
    }
}