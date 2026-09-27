// Question:
//
// Given an integer array, find the index where the
// sum of all elements to the left is equal to the
// sum of all elements to the right.
//
// Example:
// [1, 7, 3, 6, 5, 6]
//
// Output:
// 3
//
// Left sum:
// 1 + 7 + 3 = 11
//
// Right sum:
// 5 + 6 = 11

public class PivotIndex {

    public static int findPivot(int[] numbers) {

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        int leftSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int rightSum = total - leftSum - numbers[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += numbers[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 7, 3, 6, 5, 6};

        System.out.println(findPivot(numbers));
    }
}