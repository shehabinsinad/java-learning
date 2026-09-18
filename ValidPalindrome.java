// Question:
//
// Given a string, check whether it is a palindrome.
// Ignore spaces and differences between uppercase
// and lowercase letters.
//
// Example:
// "A man a plan a canal Panama"
//
// Output:
// true

public class ValidPalindrome {

    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            while (left < right && text.charAt(left) == ' ') {
                left++;
            }

            while (left < right && text.charAt(right) == ' ') {
                right--;
            }

            char first = Character.toLowerCase(text.charAt(left));
            char last = Character.toLowerCase(text.charAt(right));

            if (first != last) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        System.out.println(isPalindrome(text));
    }
}