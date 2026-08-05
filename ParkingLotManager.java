class Car {
    String carNumber;
    int hoursParked;

    Car(String carNumber, int hoursParked) {
        this.carNumber = carNumber;
        this.hoursParked = hoursParked;
    }
}

public class ParkingLotManager {

    public static int calculateFee(int hours) {
        return hours * 30;
    }

    public static int findLongestParked(int[] hours) {
        int longest = hours[0];

        for (int i = 1; i < hours.length; i++) {
            if (hours[i] > longest) {
                longest = hours[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String[] carNumbers = {
            "KL01AB1234",
            "KL07CD5678",
            "KL11EF9012",
            "KL14GH3456",
            "KL18IJ7890"
        };

        int[] hours = {3, 7, 2, 10, 5};

        Car[] cars = new Car[carNumbers.length];

        for (int i = 0; i < carNumbers.length; i++) {
            cars[i] = new Car(carNumbers[i], hours[i]);
        }

        System.out.println("Parking Fees:");

        for (Car car : cars) {
            int fee = calculateFee(car.hoursParked);
            System.out.println(car.carNumber + " - ₹" + fee);
        }

        int longest = findLongestParked(hours);

        System.out.println("\nCar Parked the Longest:");

        for (Car car : cars) {
            if (car.hoursParked == longest) {
                System.out.println(car.carNumber + " (" + car.hoursParked + " hours)");
            }
        }
    }
}