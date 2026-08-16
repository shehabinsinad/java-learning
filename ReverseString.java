// Question:
//
// Given a string, reverse it without using a built-in reverse method.
//
// Example:
// Input:  hello
// Output: olleh

public class ReverseString {

    public static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String text = "hello";

        System.out.println("Reversed: " + reverse(text));
    }
}