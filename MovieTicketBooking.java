// Question:
//
// Create a Movie class with:
// - movieName
// - availableSeats
//
// Requirements:
// - Store details of 5 movies.
// - Write a method to find the movie with the most available seats.
// - Write a method to calculate the total available seats.
// - Print whether each movie is "Almost Full" (less than 20 seats)
//   or "Available".

class Movie {
    String movieName;
    int availableSeats;

    Movie(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }
}

public class MovieTicketBooking {

    public static int findHighestSeats(int[] seats) {
        int highest = seats[0];

        for (int i = 1; i < seats.length; i++) {
            if (seats[i] > highest) {
                highest = seats[i];
            }
        }

        return highest;
    }

    public static int totalSeats(int[] seats) {
        int total = 0;

        for (int i = 0; i < seats.length; i++) {
            total += seats[i];
        }

        return total;
    }

    public static void main(String[] args) {

        String[] movieNames = {
            "Avengers",
            "Inception",
            "Interstellar",
            "Jawan",
            "Leo"
        };

        int[] seats = {18, 42, 15, 30, 12};

        Movie[] movies = new Movie[movieNames.length];

        for (int i = 0; i < movieNames.length; i++) {
            movies[i] = new Movie(movieNames[i], seats[i]);
        }

        System.out.println("Total Available Seats: " + totalSeats(seats));

        int highest = findHighestSeats(seats);

        for (Movie m : movies) {
            if (m.availableSeats == highest) {
                System.out.println("Movie with highest seats: " + m.movieName);
            }
        }

        System.out.println();
        System.out.println("Movie Status:");

        for (Movie m : movies) {
            if (m.availableSeats < 20) {
                System.out.println(m.movieName + " - Almost Full");
            } else {
                System.out.println(m.movieName + " - Available");
            }
        }
    }
}