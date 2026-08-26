// Question:
//
// Given an integer array and a target value,
// find the index of the first occurrence of the target.
//
// Example:
// Array: [4, 2, 7, 2, 9]
// Target: 2
//
// Output: 1
//
// If the target is not found, return -1.

public class FirstOccurrence {

    public static int findIndex(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 2, 7, 2, 9};

        int target = 2;

        System.out.println("Index: " + findIndex(numbers, target));
    }
}