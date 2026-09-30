// Question:
//
// Given an integer array, create a new array where
// each element is the product of all other elements.
//
// Do not use division.
//
// Example:
// [1, 2, 3, 4]
//
// Output:
// [24, 12, 8, 6]
//
// Explanation:
// 2 * 3 * 4 = 24
// 1 * 3 * 4 = 12
// 1 * 2 * 4 = 8
// 1 * 2 * 3 = 6

public class ProductExceptSelf {

    public static int[] findProducts(int[] numbers) {

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            int product = 1;

            for (int j = 0; j < numbers.length; j++) {

                if (i != j) {
                    product *= numbers[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        int[] result = findProducts(numbers);

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}