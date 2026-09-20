// Question:
//
// Print numbers from 1 to n.
//
// If a number is divisible by 3, print "Fizz".
// If a number is divisible by 5, print "Buzz".
// If it is divisible by both, print "FizzBuzz".
// Otherwise, print the number.
//
// Example for n = 15:
//
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// ...
// FizzBuzz

public class FizzBuzz {

    public static void printFizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        printFizzBuzz(15);
    }
}