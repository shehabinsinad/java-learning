// Question:
//
// Given an integer array and a target value,
// find two numbers whose sum equals the target.
//
// Example:
// Array: [2, 7, 11, 15]
// Target: 9
//
// Output:
// 2 + 7 = 9

public class TwoSum {

    public static void findTwoNumbers(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    System.out.println(
                            numbers[i] + " + " + numbers[j] + " = " + target
                    );
                    return;
                }
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};

        int target = 9;

        findTwoNumbers(numbers, target);
    }
}