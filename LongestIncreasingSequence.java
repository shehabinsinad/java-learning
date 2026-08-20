// Question:
//
// Given an array, find the length of the longest consecutive
// sequence where each number is greater than the previous number.
//
// Example:
// [1, 2, 3, 2, 4, 5, 6, 1]
// Output: 3
//
// The longest increasing sequences are:
// 1, 2, 3
// 2, 4, 5, 6
//
// The longest one has length 4.

public class LongestIncreasingSequence {

    public static int findLongest(int[] numbers) {

        int currentLength = 1;
        int longest = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > longest) {
                longest = currentLength;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 5, 6, 1};

        System.out.println("Longest Length: " + findLongest(numbers));
    }
}