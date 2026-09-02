// Question:
//
// Given an integer array, find the sum of all even numbers.
//
// Example:
// [1, 2, 4, 7, 8, 5]
// Output: 14
//
// Because 2 + 4 + 8 = 14

public class SumOfEvenNumbers {

    public static int findSum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 7, 8, 5};

        System.out.println("Sum of Even Numbers: "
                + findSum(numbers));
    }
}