class Book {
    String title;
    int borrowCount;

    Book(String title, int borrowCount) {
        this.title = title;
        this.borrowCount = borrowCount;
    }
}

public class LibraryBookTracker {

    public static int findMostBorrowed(int[] borrows) {
        int highest = borrows[0];

        for (int i = 1; i < borrows.length; i++) {
            if (borrows[i] > highest) {
                highest = borrows[i];
            }
        }

        return highest;
    }

    public static int findTotalBorrows(int[] borrows) {
        int total = 0;

        for (int count : borrows) {
            total += count;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] titles = {
                "Java Basics",
                "Python Guide",
                "Data Structures",
                "Algorithms",
                "Database Systems"
        };

        int[] borrows = {12, 7, 15, 5, 10};

        Book[] books = new Book[titles.length];

        for (int i = 0; i < titles.length; i++) {
            books[i] = new Book(titles[i], borrows[i]);
        }

        System.out.println("Most Borrowed Count: " + findMostBorrowed(borrows));
        System.out.println("Total Borrows: " + findTotalBorrows(borrows));

        System.out.println("\nBook Status:");

        for (Book b : books) {
            if (b.borrowCount >= 10) {
                System.out.println(b.title + " - Popular (" + b.borrowCount + ")");
            } else {
                System.out.println(b.title + " - Less Popular (" + b.borrowCount + ")");
            }
        }
    }
}