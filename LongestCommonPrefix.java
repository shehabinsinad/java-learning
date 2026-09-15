// Question:
//
// Given an array of strings, find the longest common
// prefix shared by all strings.
//
// Example:
// ["flower", "flow", "flight"]
//
// Output:
// "fl"

public class LongestCommonPrefix {

    public static String findPrefix(String[] words) {

        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] words = {
                "flower",
                "flow",
                "flight"
        };

        System.out.println("Common Prefix: "
                + findPrefix(words));
    }
}