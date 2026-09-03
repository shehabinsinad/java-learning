// Question:
//
// Given two integer arrays, print the elements that
// are present in both arrays.
//
// Example:
// [1, 2, 3, 4]
// [3, 4, 5, 6]
//
// Output:
// 3 4

public class CommonElements {

    public static void findCommon(int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j]) {
                    System.out.print(first[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4};
        int[] second = {3, 4, 5, 6};

        findCommon(first, second);
    }
}