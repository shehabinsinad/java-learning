// Question:
//
// Given an integer array, rotate all elements one position
// to the right.
//
// Example:
// [1, 2, 3, 4, 5]
//
// Output:
// [5, 1, 2, 3, 4]

public class RotateArray {

    public static void rotate(int[] numbers) {

        int last = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = last;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        rotate(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}