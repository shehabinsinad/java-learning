// Question:
//
// Given an integer array, move all negative numbers
// to the beginning of the array.
//
// The order of the numbers does not matter.
//
// Example:
// [1, -2, 3, -4, 5, -6]
//
// Output:
// [-2, -4, -6, 1, 3, 5]

public class MoveNegatives {

    public static void moveNegatives(int[] numbers) {

        int position = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {

                int temp = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = temp;

                position++;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, -2, 3, -4, 5, -6};

        moveNegatives(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}