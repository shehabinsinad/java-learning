// Question:
//
// Given an integer array and an integer k,
// find the maximum sum of any continuous subarray
// of size k.
//
// Example:
// [2, 1, 5, 1, 3, 2]
// k = 3
//
// Output:
// 9
//
// Because:
// 5 + 1 + 3 = 9

public class MaxSumSubarray {

    public static int findMaxSum(int[] numbers, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }

        int maxSum = sum;

        for (int i = k; i < numbers.length; i++) {

            sum = sum + numbers[i] - numbers[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 1, 5, 1, 3, 2};

        System.out.println(findMaxSum(numbers, 3));
    }
}