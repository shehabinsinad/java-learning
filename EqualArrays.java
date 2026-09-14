// Question:
//
// Given two integer arrays, check whether they contain
// the same elements in the same order.
//
// Example:
//
// [1, 2, 3, 4] -> [1, 2, 3, 4] -> true
// [1, 2, 3, 4] -> [1, 3, 2, 4] -> false

public class EqualArrays {

    public static boolean areEqual(int[] first, int[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {

            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4};

        System.out.println(areEqual(first, second));
    }
}