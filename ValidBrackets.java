// Question:
//
// Given a string containing only '(', ')', '{', '}',
// '[' and ']', determine whether the brackets are valid.
//
// Example:
// "{[()]}"
//
// Output:
// true
//
// Example:
// "{[(])}"
//
// Output:
// false

public class ValidBrackets {

    public static boolean isValid(String text) {

        char[] stack = new char[text.length()];
        int top = -1;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                stack[++top] = ch;

            } else {

                if (top == -1) {
                    return false;
                }

                char last = stack[top--];

                if (ch == ')' && last != '(') {
                    return false;
                }

                if (ch == '}' && last != '{') {
                    return false;
                }

                if (ch == ']' && last != '[') {
                    return false;
                }
            }
        }

        return top == -1;
    }

    public static void main(String[] args) {

        String text = "{[()]}";

        System.out.println(isValid(text));
    }
}