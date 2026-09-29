// Question:
//
// Given an integer array and a target difference,
// determine whether there are two numbers whose
// difference is equal to the target.
//
// Example:
// [5, 20, 3, 2, 50, 80]
// Difference = 78
//
// Output:
// true
//
// Because:
// 80 - 2 = 78

public class PairDifference {

    public static boolean hasDifference(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                int difference = Math.abs(numbers[i] - numbers[j]);

                if (difference == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 20, 3, 2, 50, 80};

        System.out.println(hasDifference(numbers, 78));
    }
}