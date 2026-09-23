// Question:
//
// Given an integer array and a target k,
// count how many continuous subarrays have
// a sum equal to k.
//
// Example:
// [1, 1, 1]
// k = 2
//
// Output:
// 2
//
// Subarrays:
// [1, 1]
// [1, 1]

public class CountSubarrays {

    public static int countSubarrays(int[] numbers, int k) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            int sum = 0;

            for (int j = i; j < numbers.length; j++) {

                sum += numbers[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1};

        System.out.println(countSubarrays(numbers, 2));
    }
}