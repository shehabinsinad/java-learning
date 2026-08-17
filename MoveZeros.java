// Question:
//
// Given an integer array, move all zeros to the end.
// The order of the other numbers should remain the same.
//
// Example:
// [0, 1, 0, 3, 12]
// Output:
// [1, 3, 12, 0, 0]

public class MoveZeros {

    public static void moveZeros(int[] numbers) {

        int position = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {
                numbers[position] = numbers[i];
                position++;
            }
        }

        while (position < numbers.length) {
            numbers[position] = 0;
            position++;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {0, 1, 0, 3, 12};

        moveZeros(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}