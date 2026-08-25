// Question:
//
// Given two sorted integer arrays, merge them into one
// sorted array.
//
// Example:
// [1, 3, 5]
// [2, 4, 6]
//
// Output:
// [1, 2, 3, 4, 5, 6]

public class MergeSortedArrays {

    public static int[] merge(int[] first, int[] second) {

        int[] result = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }

            k++;
        }

        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};

        int[] result = merge(first, second);

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}