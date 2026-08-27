// Question:
//
// Given a sorted integer array and a target value,
// find the index of the target using binary search.
//
// Example:
// Array: [1, 3, 5, 7, 9, 11]
// Target: 7
//
// Output: 3
//
// If the target is not found, return -1.

public class BinarySearch {

    public static int search(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 11};

        int target = 7;

        System.out.println("Index: " + search(numbers, target));
    }
}