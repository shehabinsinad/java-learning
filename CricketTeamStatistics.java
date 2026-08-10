// Question:
//
// Write a Cricket Team Statistics:
//
// - Create a Player class with playerName and runsScored fields.
// - Store details of 5 players.
// - Write a method to find the highest scorer.
// - Write a method to calculate the team's total runs.
// - Print whether each player scored a Half Century (50 or more)
//   or Below 50.
// - Print the highest scorer.

class Player {
    String playerName;
    int runsScored;

    Player(String playerName, int runsScored) {
        this.playerName = playerName;
        this.runsScored = runsScored;
    }
}

public class CricketTeamStatistics {

    public static int highestRuns(int[] runs) {
        int highest = runs[0];

        for (int i = 1; i < runs.length; i++) {
            if (runs[i] > highest) {
                highest = runs[i];
            }
        }

        return highest;
    }

    public static int totalRuns(int[] runs) {
        int total = 0;

        for (int run : runs) {
            total += run;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] names = {
            "Virat",
            "Rohit",
            "Gill",
            "Hardik",
            "Rahul"
        };

        int[] runs = {82, 45, 67, 29, 54};

        Player[] players = new Player[names.length];

        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i], runs[i]);
        }

        System.out.println("Total Team Runs: " + totalRuns(runs));

        int highest = highestRuns(runs);

        for (Player p : players) {
            if (p.runsScored == highest) {
                System.out.println("Highest Scorer: " + p.playerName + " (" + p.runsScored + ")");
            }
        }

        System.out.println();

        System.out.println("Player Performance:");

        for (Player p : players) {
            if (p.runsScored >= 50) {
                System.out.println(p.playerName + " - Half Century");
            } else {
                System.out.println(p.playerName + " - Below 50");
            }
        }
    }
}