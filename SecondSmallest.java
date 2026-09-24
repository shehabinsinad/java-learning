// Question:
//
// Given an integer array, find the second smallest
// distinct element without sorting the array.
//
// Example:
// [7, 3, 9, 2, 5]
//
// Output:
// 3

public class SecondSmallest {

    public static int findSecondSmallest(int[] numbers) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {

            if (number < smallest) {

                secondSmallest = smallest;
                smallest = number;

            } else if (number < secondSmallest && number != smallest) {

                secondSmallest = number;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {

        int[] numbers = {7, 3, 9, 2, 5};

        System.out.println(findSecondSmallest(numbers));
    }
}