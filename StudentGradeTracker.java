// Question:
//
// Write a Student Grade Tracker:
//
// - Create an array of student names.
// - Create an array of marks.
// - Create a Student class with name and mark fields.
// - Write a method that finds the highest mark.
// - Write a method that calculates the average mark.
// - Create an array of Student objects.
// - Print whether each student has Passed or Failed.

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class StudentGradeTracker {

    public static int findHighest(int[] marks) {
        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }

    public static double findAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};
        int[] marks = {85, 42, 67, 30, 91};

        Student[] students = new Student[names.length];

        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], marks[i]);
        }

        System.out.println("Highest Mark: " + findHighest(marks));
        System.out.println("Average Mark: " + findAverage(marks));

        System.out.println("\nPass / Fail Status:");

        for (Student s : students) {
            if (s.mark >= 50) {
                System.out.println(s.name + " - Passed (" + s.mark + ")");
            } else {
                System.out.println(s.name + " - Failed (" + s.mark + ")");
            }
        }
    }
}