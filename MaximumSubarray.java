// Question:
//
// Given an integer array, find the largest sum
// of a continuous subarray.
//
// Example:
// [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
// Output: 6
//
// Because:
// [4, -1, 2, 1] = 6

public class MaximumSubarray {

    public static int findMaximumSum(int[] numbers) {

        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            currentSum = Math.max(numbers[i],
                    currentSum + numbers[i]);

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        return maximumSum;
    }

    public static void main(String[] args) {

        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum: "
                + findMaximumSum(numbers));
    }
}