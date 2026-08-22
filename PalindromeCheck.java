// Question:
//
// Given a string, check whether it is a palindrome.
// A palindrome reads the same from left to right and right to left.
//
// Example:
// "madam" -> true
// "hello" -> false

public class PalindromeCheck {

    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "madam";

        System.out.println(isPalindrome(text));
    }
}