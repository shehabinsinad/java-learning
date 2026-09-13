// Question:
//
// Given an array of words, find the word with the
// greatest number of characters.
//
// Example:
// ["cat", "elephant", "dog", "tiger"]
//
// Output:
// elephant

public class LongestWord {

    public static String findLongest(String[] words) {

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String[] words = {
                "cat",
                "elephant",
                "dog",
                "tiger"
        };

        System.out.println("Longest Word: "
                + findLongest(words));
    }
}