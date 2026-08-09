// Question:
//
// Write an Electricity Bill Generator:
//
// - Create a House class with ownerName and unitsConsumed fields.
// - Store details of 5 houses.
// - Write a method to calculate the electricity bill
//   (₹8 per unit).
// - Write a method to find the highest electricity bill.
// - Print the bill for each house.
// - Print the owner with the highest electricity bill.

class House {
    String ownerName;
    int unitsConsumed;

    House(String ownerName, int unitsConsumed) {
        this.ownerName = ownerName;
        this.unitsConsumed = unitsConsumed;
    }
}

public class ElectricityBillGenerator {

    public static int calculateBill(int units) {
        return units * 8;
    }

    public static int findHighestBill(int[] units) {
        int highest = calculateBill(units[0]);

        for (int i = 1; i < units.length; i++) {
            int bill = calculateBill(units[i]);

            if (bill > highest) {
                highest = bill;
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        String[] owners = {
            "Rahul",
            "Anjali",
            "Vivek",
            "Meera",
            "Arun"
        };

        int[] units = {
            120,
            250,
            180,
            300,
            210
        };

        House[] houses = new House[owners.length];

        for (int i = 0; i < owners.length; i++) {
            houses[i] = new House(owners[i], units[i]);
        }

        System.out.println("Electricity Bills:");

        for (House h : houses) {
            int bill = calculateBill(h.unitsConsumed);
            System.out.println(h.ownerName + " - ₹" + bill);
        }

        int highestBill = findHighestBill(units);

        System.out.println();

        for (House h : houses) {
            if (calculateBill(h.unitsConsumed) == highestBill) {
                System.out.println("Highest Bill: " + h.ownerName + " - ₹" + highestBill);
            }
        }
    }
}