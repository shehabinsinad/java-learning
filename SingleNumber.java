// Question:
//
// Given an array where every number appears twice
// except one number, find the number that appears once.
//
// Example:
// [4, 1, 2, 1, 2]
//
// Output:
// 4

public class SingleNumber {

    public static int findSingle(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return numbers[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 1, 2, 1, 2};

        System.out.println("Single Number: "
                + findSingle(numbers));
    }
}