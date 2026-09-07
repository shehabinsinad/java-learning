// Question:
//
// Given two arrays, find the elements that appear in both.
// Each common element should be printed only once.
//
// Example:
// [1, 2, 2, 3]
// [2, 2, 4, 5]
//
// Output:
// 2

public class ArrayIntersection {

    public static void findIntersection(int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (first[k] == first[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j]) {
                    System.out.print(first[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 2, 3};
        int[] second = {2, 2, 4, 5};

        findIntersection(first, second);
    }
}