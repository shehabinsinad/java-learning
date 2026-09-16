// Question:
//
// Given an integer array, rotate the array to the right
// by k positions.
//
// Example:
//
// Array: [1, 2, 3, 4, 5]
// k = 2
//
// Output:
// [4, 5, 1, 2, 3]

public class RotateByK {

    public static void rotate(int[] numbers, int k) {

        k = k % numbers.length;

        for (int count = 0; count < k; count++) {

            int last = numbers[numbers.length - 1];

            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }

            numbers[0] = last;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        rotate(numbers, 2);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}