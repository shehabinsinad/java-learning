// Question:
//
// Write a Laptop Battery Monitor:
//
// - Create a Laptop class with model and batteryPercentage fields.
// - Store details of 5 laptops.
// - Write a method to find the laptop with the highest battery percentage.
// - Write a method to calculate the average battery percentage.
// - Print whether each laptop Needs Charging (less than 20%)
//   or Battery OK.
// - Print the laptop with the highest battery percentage.

class Laptop {
    String model;
    int batteryPercentage;

    Laptop(String model, int batteryPercentage) {
        this.model = model;
        this.batteryPercentage = batteryPercentage;
    }
}

public class LaptopBatteryMonitor {

    public static int highestBattery(int[] battery) {
        int highest = battery[0];

        for (int i = 1; i < battery.length; i++) {
            if (battery[i] > highest) {
                highest = battery[i];
            }
        }

        return highest;
    }

    public static double averageBattery(int[] battery) {
        int total = 0;

        for (int value : battery) {
            total += value;
        }

        return (double) total / battery.length;
    }

    public static void main(String[] args) {

        String[] models = {
            "HP Victus",
            "Dell Inspiron",
            "Lenovo IdeaPad",
            "Acer Aspire",
            "ASUS VivoBook"
        };

        int[] battery = {15, 65, 40, 12, 85};

        Laptop[] laptops = new Laptop[models.length];

        for (int i = 0; i < models.length; i++) {
            laptops[i] = new Laptop(models[i], battery[i]);
        }

        System.out.println("Average Battery: " + averageBattery(battery) + "%");

        int highest = highestBattery(battery);

        for (Laptop laptop : laptops) {
            if (laptop.batteryPercentage == highest) {
                System.out.println("Highest Battery: " + laptop.model
                        + " (" + laptop.batteryPercentage + "%)");
            }
        }

        System.out.println();

        System.out.println("Battery Status:");

        for (Laptop laptop : laptops) {
            if (laptop.batteryPercentage < 20) {
                System.out.println(laptop.model + " - Needs Charging");
            } else {
                System.out.println(laptop.model + " - Battery OK");
            }
        }
    }
}