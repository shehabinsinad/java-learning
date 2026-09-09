// Question:
//
// Given two strings of the same length, check whether
// they differ at only one character.
//
// Example:
// "hello"
// "jello"
//
// Output:
// true
//
// "hello"
// "world"
//
// Output:
// false

public class AlmostEqualStrings {

    public static boolean areAlmostEqual(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        int differences = 0;

        for (int i = 0; i < first.length(); i++) {

            if (first.charAt(i) != second.charAt(i)) {
                differences++;
            }

            if (differences > 1) {
                return false;
            }
        }

        return differences == 1;
    }

    public static void main(String[] args) {

        String first = "hello";
        String second = "jello";

        System.out.println(areAlmostEqual(first, second));
    }
}