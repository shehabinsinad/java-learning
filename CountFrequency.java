// Question:
//
// Given an integer array and a target number,
// count how many times the target appears.
//
// Example:
// Array: [2, 4, 2, 7, 2, 9]
// Target: 2
// Output: 3

public class CountFrequency {

    public static int countNumber(int[] numbers, int target) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 2, 7, 2, 9};

        int target = 2;

        System.out.println("Frequency: " + countNumber(numbers, target));
    }
}