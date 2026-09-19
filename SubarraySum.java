// Question:
//
// Given an array of positive integers and a target sum,
// find whether there is a continuous subarray whose
// sum equals the target.
//
// Example:
// [1, 4, 20, 3, 10, 5]
// Target: 33
//
// Output:
// true
//
// Because:
// 20 + 3 + 10 = 33

public class SubarraySum {

    public static boolean findSubarray(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            int sum = 0;

            for (int j = i; j < numbers.length; j++) {

                sum += numbers[j];

                if (sum == target) {
                    return true;
                }

                if (sum > target) {
                    break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 4, 20, 3, 10, 5};

        int target = 33;

        System.out.println(findSubarray(numbers, target));
    }
}