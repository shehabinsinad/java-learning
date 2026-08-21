// Question:
//
// Given a string, find the first character that appears only once.
//
// Example:
// Input:  swiss
// Output: w

public class FirstNonRepeating {

    public static char findFirst(String text) {

        for (int i = 0; i < text.length(); i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return text.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {

        String text = "swiss";

        char result = findFirst(text);

        if (result == '-') {
            System.out.println("No non-repeating character");
        } else {
            System.out.println("First Non-Repeating Character: " + result);
        }
    }
}