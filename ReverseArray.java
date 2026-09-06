// Question:
//
// Given an integer array, reverse the array in place.
//
// Example:
// [1, 2, 3, 4, 5]
//
// Output:
// [5, 4, 3, 2, 1]

public class ReverseArray {

    public static void reverse(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        reverse(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}