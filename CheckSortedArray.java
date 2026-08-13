// Question:
//
// Given an integer array, check whether the array is arranged
// in ascending order.
//
// Example:
// [1, 2, 3, 5, 8] -> true
// [1, 4, 3, 5, 8] -> false

public class CheckSortedArray {

    public static boolean isSorted(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 8};

        System.out.println(isSorted(numbers));
    }
}