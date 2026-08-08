// Question:
//
// Write a Bus Route Manager:
//
// - Create a Bus class with routeNumber and passengerCount fields.
// - Store details of 5 buses.
// - Write a method to find the bus carrying the most passengers.
// - Write a method to calculate the total number of passengers.
// - Print whether each bus is "Crowded" (more than 40 passengers)
//   or "Not Crowded".
// - Print the bus with the highest passenger count.

class Bus {
    String routeNumber;
    int passengerCount;

    Bus(String routeNumber, int passengerCount) {
        this.routeNumber = routeNumber;
        this.passengerCount = passengerCount;
    }
}

public class BusRouteManager {

    public static int findHighestPassengers(int[] passengers) {
        int highest = passengers[0];

        for (int i = 1; i < passengers.length; i++) {
            if (passengers[i] > highest) {
                highest = passengers[i];
            }
        }

        return highest;
    }

    public static int findTotalPassengers(int[] passengers) {
        int total = 0;

        for (int count : passengers) {
            total += count;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] routeNumbers = {
            "R101",
            "R205",
            "R310",
            "R412",
            "R525"
        };

        int[] passengers = {35, 48, 22, 51, 39};

        Bus[] buses = new Bus[routeNumbers.length];

        for (int i = 0; i < routeNumbers.length; i++) {
            buses[i] = new Bus(routeNumbers[i], passengers[i]);
        }

        System.out.println("Total Passengers: " + findTotalPassengers(passengers));

        int highest = findHighestPassengers(passengers);

        System.out.println();

        for (Bus b : buses) {
            if (b.passengerCount == highest) {
                System.out.println("Bus with Highest Passengers: " + b.routeNumber);
            }
        }

        System.out.println();
        System.out.println("Bus Status:");

        for (Bus b : buses) {
            if (b.passengerCount > 40) {
                System.out.println(b.routeNumber + " - Crowded");
            } else {
                System.out.println(b.routeNumber + " - Not Crowded");
            }
        }
    }
}