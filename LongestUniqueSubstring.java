// Question:
//
// Given a string, find the length of the longest
// substring that contains no repeating characters.
//
// Example:
// "abcabcbb"
//
// Output:
// 3
//
// Because:
// "abc" is the longest substring without repetition.

public class LongestUniqueSubstring {

    public static int findLongest(String text) {

        int longest = 0;

        for (int i = 0; i < text.length(); i++) {

            String current = "";

            for (int j = i; j < text.length(); j++) {

                char ch = text.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;

                if (current.length() > longest) {
                    longest = current.length();
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String text = "abcabcbb";

        System.out.println(findLongest(text));
    }
}