// Question:
//
// Given an array containing numbers from 1 to n,
// where one number appears more than once,
// find the duplicate number.
//
// Example:
// [1, 3, 4, 2, 2]
//
// Output:
// 2

public class FindDuplicate {

    public static int findDuplicate(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 2, 2};

        System.out.println("Duplicate: "
                + findDuplicate(numbers));
    }
}