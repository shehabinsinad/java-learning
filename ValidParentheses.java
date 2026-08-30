// Question:
//
// Given a string containing only (), {}, and [],
// check whether the brackets are properly matched.
//
// Examples:
//
// "()" -> true
// "()[]{}" -> true
// "(]" -> false
// "([{}])" -> true

public class ValidParentheses {

    public static boolean isValid(String text) {

        char[] stack = new char[text.length()];
        int top = -1;

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);

            if (current == '(' ||
                    current == '[' ||
                    current == '{') {

                top++;
                stack[top] = current;

            } else {

                if (top == -1) {
                    return false;
                }

                char opening = stack[top];
                top--;

                if (current == ')' && opening != '(') {
                    return false;
                }

                if (current == ']' && opening != '[') {
                    return false;
                }

                if (current == '}' && opening != '{') {
                    return false;
                }
            }
        }

        return top == -1;
    }

    public static void main(String[] args) {

        String text = "([{}])";

        System.out.println(isValid(text));
    }
}