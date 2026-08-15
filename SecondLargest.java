// Question:
//
// Given an integer array, find the second largest distinct number
// without sorting the array.
//
// Example:
// [10, 5, 8, 20, 15]
// Output: 15

public class SecondLargest {

    public static int findSecondLargest(int[] numbers) {

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 20, 15};

        System.out.println("Second Largest: " + findSecondLargest(numbers));
    }
}