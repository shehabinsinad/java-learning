// Question:
//
// Given two strings, check whether they contain
// the same characters with the same frequency.
//
// Example:
// "listen" and "silent" -> true
// "hello" and "world" -> false
//
// Assume the strings contain only lowercase letters.

public class AnagramCheck {

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i) - 'a']++;
            count[second.charAt(i) - 'a']--;
        }

        for (int value : count) {

            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String first = "listen";
        String second = "silent";

        System.out.println(isAnagram(first, second));
    }
}